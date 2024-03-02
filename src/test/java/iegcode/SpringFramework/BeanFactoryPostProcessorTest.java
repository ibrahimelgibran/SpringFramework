package iegcode.SpringFramework;

import iegcode.SpringFramework.data.Foo;
import iegcode.SpringFramework.prosessor.FooBeanFactoryPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import(FooBeanFactoryPostProcessor.class)
    public static class testConfiguration{
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
      applicationContext = new AnnotationConfigApplicationContext(testConfiguration.class);
      applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessor() {
        Foo foo = applicationContext.getBean(Foo.class);

        Assertions.assertNotNull(foo);
    }
}
