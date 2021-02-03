package config;
/*
    @author  zjc
    @create 2021-02-03-12:53
*/

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return configuration -> configuration.setMapUnderscoreToCamelCase(true);
    }
}
