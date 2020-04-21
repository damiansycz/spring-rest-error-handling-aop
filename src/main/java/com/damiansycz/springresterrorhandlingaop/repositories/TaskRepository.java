package com.damiansycz.springresterrorhandlingaop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.damiansycz.springresterrorhandlingaop.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
