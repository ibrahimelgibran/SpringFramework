package iegcode.SpringFramework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
       "iegcode.SpringFramework.service"
})
public class ComponentConfiguration {
}
