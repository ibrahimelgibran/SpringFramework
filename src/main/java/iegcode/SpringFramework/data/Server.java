package iegcode.SpringFramework.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class Server {

    @Bean
    public void start(){
        log.info("Start Server");
    }

    @Bean
    public void stop(){
        log.info("Stop Server");
    }
}
