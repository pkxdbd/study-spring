package org.pkx.factory;

import org.springframework.beans.factory.FactoryBean;

public class ServiceAFactoryBean implements FactoryBean<TestService> {

    @Override
    public TestService getObject() throws Exception {
        return new TestService();
    }

    @Override
    public Class<?> getObjectType() {
        return TestService.class;
    }
}
