package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");

        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        System.out.println(task1==task2);

        var properties = context.getBean(TaskProperties.class);
        System.out.println(properties);

        /*TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();*/

        context.close();
       }
}
