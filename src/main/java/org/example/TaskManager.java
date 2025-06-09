package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TaskManager {

    private  Task task;

/*    public TaskManager(Task task) {
        this.task = task;
    }*/
    public TaskManager(){

    }
    public void printTask(){
        System.out.println("Current task: " + task.toString());
    }
    @Autowired
    public void setTask(Task task) {
        this.task = task;
    }
}
