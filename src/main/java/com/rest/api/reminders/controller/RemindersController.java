package com.rest.api.reminders.controller;

import com.rest.api.reminders.dto.ReminderDto;
import com.rest.api.reminders.service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public ReminderDto save(@RequestBody ReminderDto reminder) {
        return reminderService.save(reminder);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        reminderService.delete(id);
        return ResponseEntity.ok().build();
    }
}
