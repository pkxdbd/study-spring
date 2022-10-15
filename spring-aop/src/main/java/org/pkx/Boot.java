package org.pkx;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {

    @Test
    public void scan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.pkx.configuration");
        TestAspect testService = (TestAspect) context.getBean("testAspect");
        System.out.println(testService);
        context.close();
    }

}
