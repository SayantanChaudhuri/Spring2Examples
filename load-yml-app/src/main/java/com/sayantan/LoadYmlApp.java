package com.sayantan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadYmlApp implements CommandLineRunner {

	@Autowired
	private YAMLConfig yamlConfig;

	@Autowired
	private IndiaConfig indiaConfig;

	public static void main(String[] args) {
		SpringApplication.run(LoadYmlApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("using environment: " + yamlConfig.getEnvironment());
        System.out.println("name: " + yamlConfig.getName());
		System.out.println("servers: " + yamlConfig.getServers());
		
		System.out.println("India Cities: " + indiaConfig.getCities());
	}
}
