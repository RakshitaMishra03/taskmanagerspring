package com.example.taskmanager_v1.repositories;

import com.example.taskmanager_v1.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
