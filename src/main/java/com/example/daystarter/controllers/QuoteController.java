package com.example.daystarter.controllers;

import com.example.daystarter.dto.response.QuoteResponse;
import com.example.daystarter.features.quotes.QuotesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/quotes")
@RequiredArgsConstructor
public class QuoteController {

    private final QuotesUseCase quotesUseCase;

    @GetMapping("/category")
    public ResponseEntity<QuoteResponse> getQuote(@RequestParam(name = "category")String category){

        QuoteResponse response = quotesUseCase.getQuote(category);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/random")
    public ResponseEntity<QuoteResponse> getRandomQuote(){
        QuoteResponse response = quotesUseCase.getRandomQuote();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<QuoteResponse>> getMoreQuotes(@RequestParam(name = "category") String category,
                                                             @RequestParam(name = "limit") String limit){
        List<QuoteResponse> response = quotesUseCase.getManyQuotes(category, limit);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
