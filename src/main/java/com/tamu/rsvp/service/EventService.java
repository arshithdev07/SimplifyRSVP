package com.tamu.rsvp.service;

import com.tamu.rsvp.model.Event;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
public interface EventService {

    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
}
