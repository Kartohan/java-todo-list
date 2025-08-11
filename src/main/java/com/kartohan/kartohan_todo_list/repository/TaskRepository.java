package com.kartohan.kartohan_todo_list.repository;

import com.kartohan.kartohan_todo_list.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
