package com.jobby.g6.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoMapper {

    @Bean
    public ModelMapper obterModelMapper() {
        return new ModelMapper();
    }
}
