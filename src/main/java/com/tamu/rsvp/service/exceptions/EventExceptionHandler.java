package com.tamu.rsvp.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by arshi on 3/19/2019.
 */
@ControllerAdvice
public class EventExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EventErrorResponse> handleException(EventNotFoundException ex){
        EventErrorResponse errorResponse = new EventErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<EventErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EventErrorResponse> handleAllException(Exception ex){
        EventErrorResponse errorResponse = new EventErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<EventErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
