package org.example;

import org.example.aop.Loggable;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {
    private final Task task;
    public TaskExecutor(Task task) {
        this.task = task;
    }
    @Loggable
    public void executeTask() {
        System.out.printf("Executing task with name %s, total second %s %n",
                task.getName(),
                task.getDuration());
    }
}
