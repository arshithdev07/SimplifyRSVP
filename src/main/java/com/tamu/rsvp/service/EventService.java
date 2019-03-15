package com.tamu.rsvp.service;

import com.tamu.rsvp.model.Event;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
public interface EventService {

    List<Event> getAllEvents();
    Event createEvent(Event event);
    Event updateEvent(Event event);
    void deleteEvent(Event event);
}
