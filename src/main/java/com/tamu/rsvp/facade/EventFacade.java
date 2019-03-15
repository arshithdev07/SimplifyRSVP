package com.tamu.rsvp.facade;

import com.tamu.rsvp.dto.EventDTO;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
public interface EventFacade {

    List<EventDTO> getAllEvents();
    EventDTO createEvent(EventDTO eventDTO);
    EventDTO updateEvent(EventDTO eventDTO);
    void deleteEvent(EventDTO eventDTO);
}
