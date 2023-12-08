package com.rest.api.reminders.service;

import com.rest.api.reminders.dto.ReminderDto;
import com.rest.api.reminders.mapper.ReminderMapper;
import com.rest.api.reminders.repository.ReminderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReminderServiceImpl implements ReminderService {
    private final ReminderRepository reminderRepository;
    private final ReminderMapper mapper;

    @Override
    public List<ReminderDto> getAll() {
        return mapper.map(reminderRepository.findAll());
    }

    @Override
    public ReminderDto save(ReminderDto reminder) {
        var reminderPayload = mapper.map(reminder);
        return mapper.map(reminderRepository.save(reminderPayload));
    }

    @Override
    public void delete(String id) {
        reminderRepository.deleteById(UUID.fromString(id));
    }
}
