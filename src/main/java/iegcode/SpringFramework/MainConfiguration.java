package iegcode.SpringFramework;

import iegcode.SpringFramework.configuration.BarConfiguration;
import iegcode.SpringFramework.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
