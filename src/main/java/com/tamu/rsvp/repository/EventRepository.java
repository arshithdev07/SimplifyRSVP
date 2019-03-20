package com.tamu.rsvp.repository;

import com.tamu.rsvp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by arshi on 3/15/2019.
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
