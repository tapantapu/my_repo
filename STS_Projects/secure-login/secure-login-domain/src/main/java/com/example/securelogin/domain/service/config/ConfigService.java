package com.example.securelogin.domain.service.config;

import java.util.Optional;

import com.example.securelogin.domain.model.Config;

public interface ConfigService {
	
	
	Optional<Config> findByName(String name);

	boolean createConfig(Config config);

}
