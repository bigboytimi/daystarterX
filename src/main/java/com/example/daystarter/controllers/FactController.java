package com.example.daystarter.controllers;

import com.example.daystarter.dto.response.FactResponse;
import com.example.daystarter.dto.response.QuoteResponse;
import com.example.daystarter.features.facts.FactsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/facts")
@RequiredArgsConstructor
public class FactController {
    private final FactsUseCase factsUseCase;
    @GetMapping
    public ResponseEntity<FactResponse> getOneFact(){
        FactResponse response = factsUseCase.getFact();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
