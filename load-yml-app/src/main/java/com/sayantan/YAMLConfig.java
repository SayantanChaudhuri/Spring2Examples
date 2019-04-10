package com.sayantan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private List<String> servers = new ArrayList<>();

    // standard getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * @param environment the environment to set
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * @return the servers
     */
    public List<String> getServers() {
        return servers;
    }

    /**
     * @param servers the servers to set
     */
    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}