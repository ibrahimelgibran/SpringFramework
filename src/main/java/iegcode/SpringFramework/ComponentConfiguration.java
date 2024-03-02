package iegcode.SpringFramework;

import iegcode.SpringFramework.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
       "iegcode.SpringFramework.service",
       "iegcode.SpringFramework.repository",
       "iegcode.SpringFramework.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
