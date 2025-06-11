package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");

        TaskManager taskManager = context.getBean(TaskManager.class);

        taskManager.printTask();



        context.close();
       }
}
