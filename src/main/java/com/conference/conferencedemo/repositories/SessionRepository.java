package com.conference.conferencedemo.repositories;

import com.conference.conferencedemo.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
