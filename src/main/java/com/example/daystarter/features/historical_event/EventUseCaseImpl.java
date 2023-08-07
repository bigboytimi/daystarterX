package com.example.daystarter.features.historical_event;

import com.example.daystarter.dto.request.EventRequest;
import com.example.daystarter.dto.response.EventResponse;
import com.example.daystarter.exceptions.IncompleteParameterException;
import com.example.daystarter.exceptions.RequestNotFoundException;
import com.example.daystarter.integration.EventService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventUseCaseImpl implements EventUseCase{

    private final EventService eventService;
    private final Gson gson;

    @Override
    public List<EventResponse> getEvents(EventRequest request) {
       if (request == null){
           throw new IncompleteParameterException("Request must contain at least one non-null parameter");
       }

       String text = request.getText();
       int year = request.getYear();
       int month = request.getMonth();
       int day = request.getDay();

       Type responseType = new TypeToken<List<EventResponse>>(){}.getType();

       String response = eventService.getManyEvents(text,year,month,day);

       if (response != null){
           return gson.fromJson(response, responseType);
       } else {
           throw new RequestNotFoundException("Invalid Request");
       }
    }

    @Override
    public List<EventResponse> getEventByText(String text) {
        Type responseType = new TypeToken<List<EventResponse>>(){}.getType();

        String response = eventService.getManyEventsByText(text);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Invalid Request");
        }
    }

    @Override
    public List<EventResponse> getEventByYear(int year) {
        Type responseType = new TypeToken<List<EventResponse>>(){}.getType();

        String response = eventService.getManyEventsByYear(year);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Invalid Request");
        }
    }

    @Override
    public List<EventResponse> getEventByMonth(int month) {
        Type responseType = new TypeToken<List<EventResponse>>(){}.getType();

        String response = eventService.getManyEventsByMonth(month);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Invalid Request");
        }
    }

    @Override
    public List<EventResponse> getEventByDay(int day) {
        Type responseType = new TypeToken<List<EventResponse>>(){}.getType();

        String response = eventService.getManyEventsByDay(day);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Invalid Request");
        }
    }
}
