package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("main-task")
public class Task {
    private final String name;
    private final Long duration;
    private TaskManager taskManager;

    public Task() {
        this.name = "task";
        this.duration = 60L;
    }
    @Autowired
    public void setTaskManager(TaskManager taskManager) {
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
