package com.rest.api.reminders.mapper;

import com.rest.api.reminders.dto.ReminderDto;
import com.rest.api.reminders.model.Reminder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ReminderMapper {
    Reminder map(ReminderDto reminderDto);
    ReminderDto map(Reminder reminder);
    List<ReminderDto> map(List<Reminder> reminder);
}
