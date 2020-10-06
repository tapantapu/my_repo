package com.example.securelogin.domain.service.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.securelogin.domain.model.Config;
import com.example.securelogin.domain.repository.config.ConfigRepository;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private ConfigRepository configRepository;

	@Override
	@Transactional
	public Optional<Config> findByName(String name) {
		return configRepository.findByName(name);
	}

	@Override
	@Transactional
	public boolean createConfig(Config config) {
		return configRepository.createConfig(config);
	}

}
