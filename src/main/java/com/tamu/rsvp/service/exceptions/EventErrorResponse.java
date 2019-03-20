package com.tamu.rsvp.service.exceptions;

/**
 * Created by arshi on 3/19/2019.
 */
public class EventErrorResponse {

    private int status;
    private String message;
    private  long timeStamp;

    public EventErrorResponse() {

    }

    public EventErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
