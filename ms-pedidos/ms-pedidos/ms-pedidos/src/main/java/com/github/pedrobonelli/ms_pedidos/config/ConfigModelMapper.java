package com.github.pedrobonelli.ms_pedidos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class ConfigModelMapper {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
