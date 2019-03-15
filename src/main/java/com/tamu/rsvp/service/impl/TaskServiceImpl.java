package com.tamu.rsvp.service.impl;

import com.tamu.rsvp.model.Task;
import com.tamu.rsvp.repository.TaskDAO;
import com.tamu.rsvp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arshi on 10/23/2018.
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskDAO taskDAO;

    @Override
    public List<Task> getAllTasks() {
        return taskDAO.findAll();
    }

    @Override
    public Task addTask(Task task) {
        return taskDAO.save(task);
    }


}

