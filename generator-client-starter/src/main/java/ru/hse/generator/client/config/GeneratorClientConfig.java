package ru.hse.generator.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.hse.generator.client")
public class GeneratorClientConfig {}
