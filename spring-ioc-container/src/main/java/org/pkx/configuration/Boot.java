package org.pkx.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {


//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestService.class);
//        TestService testService = (TestService) context.getBean("testService");
//        System.out.println(testService);
//        context.close();
//    }


    @Test
    public void scan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.pkx.configuration");
        TestService testService = (TestService) context.getBean("testService");
        System.out.println(testService);
        context.close();
    }
}
