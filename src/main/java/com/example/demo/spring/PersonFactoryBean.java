package com.example.demo.spring;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return "factory-object-bean";
    }

    @Override
    public Class<?> getObjectType() {
        return java.lang.String.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
