package iegcode.SpringFramework;

import iegcode.SpringFramework.data.Bar;
import iegcode.SpringFramework.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
