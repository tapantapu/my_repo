package com.example.securelogin.domain.repository.config;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.securelogin.domain.model.Config;

@Repository
public interface ConfigRepository {

	Optional<Config> findByName(String name);

	boolean createConfig(Config config);

}
