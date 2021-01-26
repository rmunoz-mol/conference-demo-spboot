package com.pluralsight.conferencedemospboot.repositories;

import com.pluralsight.conferencedemospboot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
