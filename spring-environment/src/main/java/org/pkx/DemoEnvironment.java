package org.pkx;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DemoEnvironment implements EnvironmentAware {

    Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(environment.getProperty("spring.profiles.active"));
        System.out.println("");
    }
}
