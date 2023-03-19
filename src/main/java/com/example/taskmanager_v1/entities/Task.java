package com.example.taskmanager_v1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity(name = "tasks")
@Setter
@Getter
public class Task extends Base {
    @Column(name = "title", nullable = false)
    String title;
    @Column(name = "description", nullable = true)
    String description;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default false")
    Boolean completed = false;
    @Column(name = "due_date", nullable = false)
    Date dueDate = new Date();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}
