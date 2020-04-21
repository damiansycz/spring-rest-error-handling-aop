package com.damiansycz.springresterrorhandlingaop.utils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.damiansycz.springresterrorhandlingaop.entities.Task;
import com.damiansycz.springresterrorhandlingaop.repositories.TaskRepository;

@Component
public class DataLoader {

    private TaskRepository repository;

    @Autowired
    public DataLoader(TaskRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void loadExamples() {
        repository.save(new Task("Pay the bills"));
        repository.save(new Task("Book the hotel"));
    }

    @PreDestroy
    public void removeExamples() {
        repository.deleteAll();
    }
}
