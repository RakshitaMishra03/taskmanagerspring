package com.example.taskmanager_v1.services;

import com.example.taskmanager_v1.repositories.NotesRepository;
import com.example.taskmanager_v1.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import javax.xml.soap.Node;

@Service
public class TaskService {
    final TaskRepository taskRepository;
    final NotesRepository notesRepository;

    public TaskService(TaskRepository taskRepository, NotesRepository notesRepository){
        this.taskRepository = taskRepository;
        this.notesRepository = notesRepository;

    }
}
