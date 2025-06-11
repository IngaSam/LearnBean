package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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

    public void printTask(){
      if (task == null) {
          System.out.println("No current task");
      } else {
          System.out.println("Current task: " + task.toString());
      }
    }

}
