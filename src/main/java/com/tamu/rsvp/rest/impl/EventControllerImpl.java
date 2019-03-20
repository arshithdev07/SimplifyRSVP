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
public class EventControllerImpl implements EventController {

    @Autowired
    EventFacade eventFacade;

    @Override
    @GetMapping("/events")
    public List<EventDTO> getAllEvents() {
        return eventFacade.getAllEvents();
    }

    @Override
    @GetMapping("/events/{id}")
    public EventDTO getEventById(@PathVariable Long id) {
        return eventFacade.getEventById(id);
    }

    @Override
    @PostMapping(value = "/events")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        return eventFacade.createEvent(eventDTO);
    }

    @Override
    @PutMapping(value = "/events/{id}")
    public EventDTO updateEvent(@PathVariable Long id, @RequestBody EventDTO eventDTO) {
        return eventFacade.updateEvent(id, eventDTO);
    }

    @Override
    @DeleteMapping(value = "/events/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventFacade.deleteEvent(id);
    }
}
