package org.pkx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class TestController {

    @GetMapping("/test")
    @TestAnnotation
    public void test(){
        System.out.println("test");
    }

}
