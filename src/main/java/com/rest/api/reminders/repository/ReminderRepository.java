package com.rest.api.reminders.repository;

import com.rest.api.reminders.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReminderRepository extends JpaRepository<Reminder, UUID> {
}
