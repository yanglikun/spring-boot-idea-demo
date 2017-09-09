package com.example.demo.spring;

import java.util.concurrent.TimeUnit;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("shutdown jvm");
            }
        });

        TimeUnit.SECONDS.sleep(2);

        System.exit(0);
    }

}
