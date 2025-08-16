package com.kartohan.kartohan_todo_list.controller;

import com.kartohan.kartohan_todo_list.repository.TaskRepository;
import com.kartohan.kartohan_todo_list.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
