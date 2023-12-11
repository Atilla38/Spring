package com.pms.ordermanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.ordermanager.entity.Task;
import com.pms.ordermanager.repository.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskController {
    
    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/index")
    public List<Task> index() {
        return this.taskRepository.findAll();
    }

    @GetMapping("/add")
    public void addTask(@RequestParam(value = "resource") String resource, @RequestParam(value = "amount") int amount) {
        this.taskRepository.save(new Task(resource, amount));
    }
}
