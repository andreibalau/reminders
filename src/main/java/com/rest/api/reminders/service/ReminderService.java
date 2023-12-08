package com.rest.api.reminders.service;

import com.rest.api.reminders.dto.ReminderDto;

import java.util.List;

public interface ReminderService {
    List<ReminderDto> getAll();
    ReminderDto save(ReminderDto reminder);
    void delete(String id);
}
