package com.tamu.rsvp.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by arshi on 3/18/2019.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EventNotFoundException extends RuntimeException{

    public EventNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
