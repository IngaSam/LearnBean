package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");

        TaskManager taskManager = context.getBean(TaskManager.class);

        var result = taskManager.printTask();
        System.out.println("результат = " + result);



        context.close();
       }
}
