package com.study.eurekazuul.config;
import com.study.eurekazuul.filter.AuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * EurekaZuulConfig
 * 应用配置类，初始化 Bean和配置信息
 *
 * @author mayunzhen
 * @version 1.0.0
 */
@Configuration
public class EurekaZuulConfig {

    @Bean
    public AuthFilter authFilter(){
        return new AuthFilter();
    }
}