package iegcode.SpringFramework;

import iegcode.SpringFramework.data.Connection;
import iegcode.SpringFramework.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class lifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }


    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
