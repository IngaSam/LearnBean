package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.aop.Loggable;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {
    private final Task task;

    public TaskManager(Task task) {
      this.task = task;
       // System.out.println("call taskManager constructor");
    }
    @PostConstruct
    public void init() {
       // System.out.println("call taskManager init");
    }
    @PreDestroy
    public void destroy() {
       // System.out.println("call taskManager destroy");
    }
    @Loggable(times=3)
    public Integer printTask(){

          System.out.println("Current task: " + task.toString());
        //throw new RuntimeException(" Exception in taskManager");
          return task.getDuration();

    }

}
