package com.example.daystarter.controllers;

import com.example.daystarter.dto.request.EventRequest;
import com.example.daystarter.dto.response.EventResponse;
import com.example.daystarter.features.historical_event.EventUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/events")
@RequiredArgsConstructor
public class EventsController {
    private final EventUseCase eventUseCase;
    @GetMapping
    public ResponseEntity<List<EventResponse>> getEvents(EventRequest request){
        List<EventResponse> response = eventUseCase.getEvents(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/text/{textString}")
    public ResponseEntity<List<EventResponse>> getEventByText(@PathVariable(name = "textString") String text){
        List<EventResponse> response = eventUseCase.getEventByText(text);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/year/{yearNum}")
    public ResponseEntity<List<EventResponse>> getEventByYear(@PathVariable(name = "yearNum") int year){
        List<EventResponse> response = eventUseCase.getEventByYear(year);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/month/{monthNum}")
    public ResponseEntity<List<EventResponse>> getEventByMonth(@PathVariable(name = "monthNum") int month){
        List<EventResponse> response = eventUseCase.getEventByMonth(month);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/day/{dayNum}")
    public ResponseEntity<List<EventResponse>> getEventByDay(@PathVariable(name = "dayNum") int day){
        List<EventResponse> response = eventUseCase.getEventByDay(day);
        return ResponseEntity.ok(response);
    }

}
