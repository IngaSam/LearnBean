package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TaskConfiguration {
    @Bean("main-task")
    public Task task()
    {
        return new Task();

    }


/*    @Bean("not-main-task")
    public Task task2(){
        return new Task();
    }*/
    @Bean
    public TaskManager taskManager(
           Task  task
    ){
        return new TaskManager(task);
    }
}
