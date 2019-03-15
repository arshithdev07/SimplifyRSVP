package com.tamu.rsvp.dto;


import java.util.Date;

/**
 * Created by arshi on 3/15/2019.
 */
public class EventDTO {

    private Long eventId;
    private String eventName;
    private Date eventDate;
    private String duration;
    private int studentCounter;
    private String tags;
    private String registeredBy;
    private Date eventCreatedDate;
    private Date eventUpdatedDate;

    public Date getEventUpdatedDate() {
        return eventUpdatedDate;
    }

    public void setEventUpdatedDate(Date eventUpdatedDate) {
        this.eventUpdatedDate = eventUpdatedDate;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getStudentCounter() {
        return studentCounter;
    }

    public void setStudentCounter(int studentCounter) {
        this.studentCounter = studentCounter;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public Date getEventCreatedDate() {
        return eventCreatedDate;
    }

    public void setEventCreatedDate(Date eventCreatedDate) {
        this.eventCreatedDate = eventCreatedDate;
    }
}
