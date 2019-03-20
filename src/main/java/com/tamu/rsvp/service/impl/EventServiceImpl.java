package com.tamu.rsvp.service.impl;

import com.tamu.rsvp.model.Event;
import com.tamu.rsvp.repository.EventRepository;
import com.tamu.rsvp.service.EventService;
import com.tamu.rsvp.service.exceptions.EventNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by arshi on 3/15/2019.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        Optional<Event> event = eventRepository.findById(id);

        if(!event.isPresent()){
            throw new EventNotFoundException("Event with id " + id + " not found");
        }

        return event.get();
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        Event existingEvent = getEventById(id);
        existingEvent.setEventName(event.getEventName());
        existingEvent.setDuration(event.getDuration());
        existingEvent.setEventDate(event.getEventDate());
        existingEvent.setStudentCounter(event.getStudentCounter());
        existingEvent.setTags(event.getTags());
        return eventRepository.save(existingEvent);
    }

    @Override
    public void deleteEvent(Long id) {
         eventRepository.deleteById(id);
    }
}
