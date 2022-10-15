package org.pkx.factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {


    @Test
    public void scan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.pkx.factory");
        TestService testService = (TestService) context.getBean("serviceAFactoryBean");
        TestService serviceA = (TestService) context.getBean("testService");
        System.out.println(testService);
        context.close();
    }
}
