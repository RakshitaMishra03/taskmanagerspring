package com.example.taskmanager_v1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity(name = "tasks")
@Getter
@Setter
public class Task extends Base {
    @Column(name = "title", nullable = false)
    String title;
    @Column(name = "description", nullable = true)
    String description;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default false")
    Boolean completed = false;

}
