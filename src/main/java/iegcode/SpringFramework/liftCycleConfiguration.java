package iegcode.SpringFramework;

import iegcode.SpringFramework.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class liftCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }
}
