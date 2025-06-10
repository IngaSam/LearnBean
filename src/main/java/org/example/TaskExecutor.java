package org.example;

import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {
    private final Task task;
    public TaskExecutor(Task task) {
        this.task = task;
    }
    public void executeTask() {
        System.out.printf("Executing task with name %s, total second %s %n",
                task.getName(),
                task.getDuration());
    }
}
