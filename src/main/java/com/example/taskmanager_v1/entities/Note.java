package com.example.taskmanager_v1.entities;

import javax.persistence.*;

@Entity(name = "notes")
public class Note extends Base {
    @Column(name = "body", nullable = true,length = 1000)
    String body;

    @ManyToOne()
    Task task;

}
