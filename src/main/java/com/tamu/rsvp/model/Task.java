package com.tamu.rsvp.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by arshi on 10/23/2018.
 */
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskId;
    private String taskName;
    private String taskDescription;

    @CreationTimestamp
    private Timestamp taskDate;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Timestamp getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Timestamp taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
