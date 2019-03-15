package com.tamu.rsvp.rest;

import com.tamu.rsvp.model.Task;

import java.util.List;

/**
 * Created by arshi on 10/23/2018.
 */
public interface TaskController {
    List<Task> getAllTasks();
    Task addTask(Task task);
}
