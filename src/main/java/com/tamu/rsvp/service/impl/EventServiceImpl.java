package com.tamu.rsvp.service.impl;

import com.tamu.rsvp.model.Event;
import com.tamu.rsvp.repository.EventDAO;
import com.tamu.rsvp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventDAO eventDAO;

    @Override
    public List<Event> getAllEvents() {
        return eventDAO.findAll();
    }

    @Override
    public Event createEvent(Event event) {
        return eventDAO.save(event);
    }

    @Override
    public Event updateEvent(Event event) {
        return eventDAO.save(event);
    }

    @Override
    public void deleteEvent(Event event) {
         eventDAO.delete(event);
    }
}
