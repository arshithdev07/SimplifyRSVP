package com.tamu.rsvp.rest.impl;

import com.tamu.rsvp.dto.EventDTO;
import com.tamu.rsvp.facade.EventFacade;
import com.tamu.rsvp.rest.EventController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by arshi on 3/15/2019.
 */
@RestController
@RequestMapping("/events")
public class EventControllerImpl implements EventController {

    @Autowired
    EventFacade eventFacade;

    @Override
    @GetMapping
    public List<EventDTO> getAllEvents() {
        return eventFacade.getAllEvents();
    }

    @Override
    @PostMapping(value = "/add")
    public EventDTO createEvent(EventDTO eventDTO) {
        return eventFacade.createEvent(eventDTO);
    }

    @Override
    @PutMapping(value = "/edit")
    public EventDTO updateEvent(EventDTO eventDTO) {
        return eventFacade.updateEvent(eventDTO);
    }

    @Override
    @DeleteMapping(value = "/delete")
    public void deleteEvent(EventDTO eventDTO) {
        eventFacade.deleteEvent(eventDTO);
    }
}
