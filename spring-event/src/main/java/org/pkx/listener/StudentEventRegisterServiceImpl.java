package org.pkx.listener;

import org.pkx.listener.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;


@Service
@RestController
public class StudentEventRegisterServiceImpl {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private Test test;

    @RequestMapping("/test1")
    public void register() {
        Student student = new Student();
        student.setId(1);
        student.setName("tom");
        applicationEventPublisher.publishEvent(student);
        System.out.println("结束了");
    }
    @RequestMapping("/test2")
    public void register2() {
        Student student = new Student();
        student.setId(1);
        student.setName("tom");
        applicationEventPublisher.publishEvent(student);
        System.out.println("结束了");


    }

    @RequestMapping("/test3")
    public void register3() throws InterruptedException {
        Executors.newFixedThreadPool(10).submit(this::test);
        System.out.println(Thread.currentThread().getName());
    }


    public void test() {
        System.out.println(Thread.currentThread().getName());
    }

    @RequestMapping("/test4")
    public void register4() throws InterruptedException {
        test.test4();
        System.out.println(Thread.currentThread().getName());
    }


}