package com.example.demo.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SimpleBeanFactory {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(factory);
        beanDefinitionReader.loadBeanDefinitions(resource);

        Integer age = (Integer) factory.getBean("age");
        String name = factory.getBean("name", String.class);
        System.out.println(name);
        System.out.println(age);
    }
}
