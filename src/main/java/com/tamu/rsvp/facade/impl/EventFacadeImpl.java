package com.tamu.rsvp.facade.impl;

import com.tamu.rsvp.config.dozer.DozerMappingService;
import com.tamu.rsvp.dto.EventDTO;
import com.tamu.rsvp.facade.EventFacade;
import com.tamu.rsvp.model.Event;
import com.tamu.rsvp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
@Service
public class EventFacadeImpl implements EventFacade {

    @Autowired
    EventService eventService;

    @Autowired
    DozerMappingService dozerMappingService;

    @Override
    public List<EventDTO> getAllEvents() {
        return dozerMappingService.mapCollection(eventService.getAllEvents(), EventDTO.class);
    }

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = dozerMappingService.map(eventDTO, Event.class);
        return dozerMappingService.map(eventService.createEvent(event), EventDTO.class );
    }

    @Override
    public EventDTO updateEvent(EventDTO eventDTO) {
        Event event = dozerMappingService.map(eventDTO, Event.class);
        return dozerMappingService.map(eventService.updateEvent(event), EventDTO.class );
    }

    @Override
    public void deleteEvent(EventDTO eventDTO) {
        Event event = dozerMappingService.map(eventDTO, Event.class);
        eventService.deleteEvent(event);

    }
}
