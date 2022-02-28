package com.hasithat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.hasithat.resource")
@Configuration
public class Config {


}
