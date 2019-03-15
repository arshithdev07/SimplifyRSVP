package com.tamu.rsvp.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by arshi on 3/15/2019.
 */
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long eventId;
    private String eventName;
    private Date eventDate;
    private String duration;
    private int studentCounter;
    private String tags;
    private String registeredBy;

    @CreationTimestamp
    private Date eventCreatedDate;

    @UpdateTimestamp
    private Date eventUpdatedDate;

    public Date getEventUpdatedDate() {
        return eventUpdatedDate;
    }

    public void setEventUpdatedDate(Date eventUpdatedDate) {
        this.eventUpdatedDate = eventUpdatedDate;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getEventCreatedDate() {
        return eventCreatedDate;
    }

    public void setEventCreatedDate(Timestamp eventCreatedDate) {
        this.eventCreatedDate = eventCreatedDate;
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


}
