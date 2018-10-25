package com.tamu.rsvp.facade.impl;

import com.tamu.rsvp.facade.TaskFacade;
import com.tamu.rsvp.model.Task;
import com.tamu.rsvp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arshi on 10/23/2018.
 */
@Service
public class TaskFacadeImpl implements TaskFacade {

    @Autowired
    TaskService taskService;

    @Override
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}
