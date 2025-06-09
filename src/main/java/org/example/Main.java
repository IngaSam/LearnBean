package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");
   /*     AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class); //через Configuration*/
/*        Task task = context.getBean(Task.class); //вывод по классу
        Task task2 = (Task) context.getBean("main-task"); // вывод по его имени*/
/*        System.out.println(task);
        System.out.println(task2);
        System.out.println(task==task2);*/

        TaskManager taskManager = (TaskManager)context.getBean("taskManager");
        taskManager.printTask();
       }
}