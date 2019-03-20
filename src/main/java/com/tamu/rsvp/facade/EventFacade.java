package com.tamu.rsvp.facade;

import com.tamu.rsvp.dto.EventDTO;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
public interface EventFacade {

    List<EventDTO> getAllEvents();
    EventDTO getEventById(Long id);
    EventDTO createEvent(EventDTO eventDTO);
    EventDTO updateEvent(Long id, EventDTO eventDTO);
    void deleteEvent(Long id);
}
