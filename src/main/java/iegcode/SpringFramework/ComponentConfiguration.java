package iegcode.SpringFramework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
       "iegcode.SpringFramework.service",
       "iegcode.SpringFramework.repository"
})
public class ComponentConfiguration {
}
