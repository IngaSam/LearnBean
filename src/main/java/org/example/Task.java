package org.example;

import org.springframework.stereotype.Component;

//@Component("main-task")
public class Task {
    private final String name;
    private final Long duration;
    public Task() {
        this.name = "task";
        this.duration = 60L;
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
