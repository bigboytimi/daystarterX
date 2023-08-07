package com.example.daystarter.integration;

public interface EventService {
    String getManyEvents(String text, int year, int month, int day);

    String getManyEventsByYear(int year);

    String getManyEventsByText(String text);

    String getManyEventsByMonth(int month);

    String getManyEventsByDay(int day);
}
