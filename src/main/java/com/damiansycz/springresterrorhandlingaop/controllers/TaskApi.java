package com.damiansycz.springresterrorhandlingaop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.damiansycz.springresterrorhandlingaop.entities.Task;
import com.damiansycz.springresterrorhandlingaop.exceptions.TaskNotFoundException;
import com.damiansycz.springresterrorhandlingaop.repositories.TaskRepository;

@RestController
public class TaskApi {

    private TaskRepository repository;

    @Autowired
    public TaskApi(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable long id) {
        return repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }
}
