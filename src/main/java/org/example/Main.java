package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");
   /*     AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class); //через Configuration*/
        Task mainTask = (Task)context.getBean("main-task");
 //       Task notMainTask = (Task) context.getBean("not-main-task");
/*        System.out.println(task);
        System.out.println(task2);
        System.out.println(task==task2);*/

        TaskManager taskManager = (TaskManager)context.getBean("taskManager");
        taskManager.printTask();
       }
}
