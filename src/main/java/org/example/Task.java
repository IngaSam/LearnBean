package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
//@Scope("prototype")
public class Task {
    private final String name;
    private final Integer duration;

    public Task() {
        this.name = "task";
        this.duration = 60;
        System.out.println("call task constructor");
    }
    //Метод, который отрабатывает после создания бина, но перед тем как его положат в ApplicationContext или отдадут вызывающему коду
    @PostConstruct
    public void postConstruct(){
        System.out.println("call task post construct");
    }

    //Метод перед уничтожением Бина
    @PreDestroy
    public void preDestroy(){
        System.out.println("call task pre destroy");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
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
