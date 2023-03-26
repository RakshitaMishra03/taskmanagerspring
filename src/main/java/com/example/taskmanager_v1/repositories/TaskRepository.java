package com.example.taskmanager_v1.repositories;

import com.example.taskmanager_v1.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findAllByCompleted(boolean completed);

    @Query("Select T from tasks t where t.completed=false and t.createdAt < CURRENT_DATE")
    List<Task> findAllOverdue();


}
