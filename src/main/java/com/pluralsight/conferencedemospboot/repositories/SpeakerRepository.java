package com.pluralsight.conferencedemospboot.repositories;

import com.pluralsight.conferencedemospboot.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
