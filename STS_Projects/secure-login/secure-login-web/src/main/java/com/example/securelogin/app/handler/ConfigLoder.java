/**
 * 
 */
package com.example.securelogin.app.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.StreamSupport;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;

import com.example.securelogin.domain.model.Config;
import com.example.securelogin.domain.service.config.ConfigService;

/**
 * @author tapan
 *
 */
@Component
public class ConfigLoder {
	private static final Logger LOG = LoggerFactory.getLogger(ConfigLoder.class);
	
	@Autowired
	private Environment springEnv;
 
	@Autowired
	private ConfigService configService;
	
	@PostConstruct
	public void loadConfig() {
		LOG.debug("SpringEnv {}",springEnv);
		
		
		Map<String, Object> props = new HashMap<String, Object>();
		MutablePropertySources propSrcs = ((AbstractEnvironment) springEnv).getPropertySources();
		StreamSupport.stream(propSrcs.spliterator(), false).filter(ps -> ps instanceof EnumerablePropertySource)
				.map(ps -> ((EnumerablePropertySource) ps).getPropertyNames()).flatMap(Arrays::<String>stream)				
				.forEach(propName -> props.put(propName, springEnv.getProperty(propName)));
		
		
		LOG.debug("Env Values are {}",props);
		
		for(Map.Entry<String, Object> entry :props.entrySet()) {
			LOG.debug("Key = {} ,value = {} ",entry.getKey(),entry.getValue() );
			if(entry.getKey().startsWith("security.")) {
				Optional<Config> config = configService.findByName(entry.getKey());
				
				if(!config.isPresent()) {
					Config confg = new Config();
					confg.setName(entry.getKey());
					confg.setValue((String) entry.getValue());
					boolean isInserted = configService.createConfig(confg);
					if(isInserted) {
						LOG.debug("Successfully Inserted Key = {} value = {} ",confg.getName(),confg.getValue());
					}
					
				}
				
			}
		}
		
	}

}
