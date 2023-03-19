package com.example.taskmanager_v1.entities;

import javax.persistence.*;

@Entity(name = "notes")
public class Note extends Base {
    @Column(name = "body", nullable = true,length = 1000)
    String body;

    @ManyToOne()
    Task task;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
