package com.example.taskmanager_v1.repositories;

import com.example.taskmanager_v1.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {
}
