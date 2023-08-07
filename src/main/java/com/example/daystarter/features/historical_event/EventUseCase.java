package com.example.daystarter.features.historical_event;

import com.example.daystarter.dto.request.EventRequest;
import com.example.daystarter.dto.response.EventResponse;

import java.util.List;

public interface EventUseCase {
    List<EventResponse> getEvents(EventRequest request);

    List<EventResponse> getEventByText(String text);

    List<EventResponse> getEventByYear(int year);

    List<EventResponse> getEventByMonth(int month);

    List<EventResponse> getEventByDay(int day);
}
