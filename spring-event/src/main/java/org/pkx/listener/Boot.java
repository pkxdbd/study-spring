package org.pkx.listener;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {



    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.pkx");
        StudentEventRegisterServiceImpl service = (StudentEventRegisterServiceImpl) context.getBean("studentEventRegisterServiceImpl");
        service.register();
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
