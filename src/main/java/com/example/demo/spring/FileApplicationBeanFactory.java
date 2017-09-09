package com.example.demo.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class FileApplicationBeanFactory {

    public static void main(String[] args) throws InterruptedException {
        FileSystemXmlApplicationContext ctx =
                new FileSystemXmlApplicationContext
                        (
                                "file:/D:/worksapce/sprint-boot/spring-boot-idea-demo/src/main/resources/spring"
                                        + "-config.xml",
                                "file:/D:/worksapce/sprint-boot/spring-boot-idea-demo/src/main/resources/spring"
                                        + "-config-2.xml"
                        );
        Runtime.getRuntime().addShutdownHook(new Thread(() -> ctx.destroy()));
        System.out.println(ctx.getBean("age"));
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean("personString"));
    }

}
