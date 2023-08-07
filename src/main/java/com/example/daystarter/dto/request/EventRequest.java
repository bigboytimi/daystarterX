package com.example.daystarter.dto.request;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EventRequest {
    private String text;
    private int year;
    private int month;
    private int day;
}
