package com.sayantan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("india")
@EnableAutoConfiguration
public class IndiaConfig {

    private List<String> cities = new ArrayList<>();

	public List<String> getCities() {
		return this.cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
}