package com.rest.api.reminders.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReminderDto {
    public String id;
    public String title;
    public Date createDate;
    public Date updateDate;
}
