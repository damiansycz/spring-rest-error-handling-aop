package com.damiansycz.springresterrorhandlingaop.exceptions;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Long id) {
        super("Could not find task with id: " + id);
    }
}
