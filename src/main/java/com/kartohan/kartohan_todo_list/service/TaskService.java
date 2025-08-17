package com.kartohan.kartohan_todo_list.service;

import com.kartohan.kartohan_todo_list.todo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> findAllTasks();
    Optional<Task> findTaskById(Long id);
    Task saveTask(Task task);
    Task updateTask(Long id, Task task);
    void deleteTaskById(Long id);
}
