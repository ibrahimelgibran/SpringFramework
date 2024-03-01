package iegcode.SpringFramework.configuration;

import iegcode.SpringFramework.data.Bar;
import iegcode.SpringFramework.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
