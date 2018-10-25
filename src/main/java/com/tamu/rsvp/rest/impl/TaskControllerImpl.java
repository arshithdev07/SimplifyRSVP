package com.tamu.rsvp.rest.impl;

import com.tamu.rsvp.facade.TaskFacade;
import com.tamu.rsvp.model.Task;
import com.tamu.rsvp.rest.TaskController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by arshi on 10/23/2018.
 */
@RestController
@RequestMapping("/tasks")
public class TaskControllerImpl implements TaskController {

    @Autowired
    TaskFacade taskFacade;

    @GetMapping
    @Override
    public List<Task> getAllTasks() {
        return taskFacade.getAllTasks();
    }
}
