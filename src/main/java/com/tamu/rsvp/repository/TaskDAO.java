package com.tamu.rsvp.repository;

import com.tamu.rsvp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by arshi on 3/14/2019.
 */
@Repository
public interface TaskDAO extends JpaRepository<Task, Integer> {
}
