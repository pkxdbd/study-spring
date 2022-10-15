package org.pkx.listener;

import org.pkx.listener.entity.Student;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component

public class StudentEventListener {

    @Async
    @EventListener(condition = "#student.id != null")
    public void handleEvent1(Student student){
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student+"1111111111111");
    }
    @Async
    @EventListener(condition = "#student.id != null")
    public void handleEvent2(Student student){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName());
        throw new NullPointerException();

//        System.out.println(student);
    }
}
