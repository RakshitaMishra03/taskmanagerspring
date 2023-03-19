package com.example.taskmanager_v1.repositories;

import com.example.taskmanager_v1.entities.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TaskRepositoryTest {
    @Autowired TaskRepository taskRepository;

    @Test
    public void testCreateTask(){
        Task task = new Task();
        task.setTitle("Task 1");
        task.setDescription("Description 1");
        task.setCompleted(true);
        assertNotNull(taskRepository.save(task));

    }

    @Test
    public void readTasksWorks(){
        Task task = new Task();
        task.setTitle("Task 2");
        task.setDescription("Description 2");
        task.setCompleted(true);
        Task task1 = new Task();
        task1.setTitle("Task 3");
        task1.setDescription("Description 3");
        task1.setCompleted(true);
        taskRepository.save(task);
        taskRepository.save(task1);
        assertNotNull(taskRepository.findAll());


    }
}
