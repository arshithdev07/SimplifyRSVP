package com.tamu.rsvp.service.impl;

import com.tamu.rsvp.model.Task;
import com.tamu.rsvp.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by arshi on 10/23/2018.
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<Task> getAllTasks() {
        Task task1 = new Task();
        task1.setTaskId("1");
        task1.setTaskName("Dummy Task");
        task1.setTaskDate(new Date());
        task1.setTaskDescription("This is a dummy task. ");

        Task task2 = new Task();
        task2.setTaskId("2");
        task2.setTaskName("Dummy Task new ");
        task2.setTaskDate(new Date());
        task2.setTaskDescription("This is a new dummy task. ");

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);

        return taskList;
    }
}
