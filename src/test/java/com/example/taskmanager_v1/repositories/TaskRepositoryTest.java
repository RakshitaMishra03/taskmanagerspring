package com.example.taskmanager_v1.repositories;

import com.example.taskmanager_v1.entities.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
}
