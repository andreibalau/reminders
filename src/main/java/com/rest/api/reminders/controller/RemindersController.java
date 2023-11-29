package com.rest.api.reminders.controller;

import com.rest.api.reminders.dto.ReminderDto;
import com.rest.api.reminders.service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1.0/reminders")
@RequiredArgsConstructor
public class RemindersController {
    private final ReminderService reminderService;

    @GetMapping
    public List<ReminderDto> getAll() {
        return reminderService.getAll();
    }

    @PostMapping
    public ReminderDto save(@RequestBody ReminderDto reminder) {
        return reminderService.save(reminder);
    }
}
