package org.pkx;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {

    @Test
    public void scan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.pkx");
        Object serviceA = context.getBean("serviceA");
        System.out.println(serviceA);
        context.close();
    }


    public static void main(String[] args) {

    }
}
