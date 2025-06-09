package org.example;

import org.springframework.stereotype.Component;

//@Component("main-task")
public class Task {
    private final String name;
    private final Long duration;
    private TaskManager taskManager;

    public Task(TaskManager taskManager) {
        this.name = "task";
        this.duration = 60L;
        this.taskManager = taskManager;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
