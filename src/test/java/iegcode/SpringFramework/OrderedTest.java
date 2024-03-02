package iegcode.SpringFramework;

import iegcode.SpringFramework.data.Car;
import iegcode.SpringFramework.prosessor.IdGeneratorBeanProcessor;
import iegcode.SpringFramework.prosessor.PrefixIdGeneratorBeanProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanProcessor.class,
            PrefixIdGeneratorBeanProcessor.class
    })
    public static class testConfiguration{
    }


    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(testConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testCar() {
        Car car = applicationContext.getBean(Car.class);

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("IEG-"));
    }
}
