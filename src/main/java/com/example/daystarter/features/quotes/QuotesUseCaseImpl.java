package com.example.daystarter.features.quotes;

import com.example.daystarter.dto.response.QuoteResponse;
import com.example.daystarter.exceptions.RequestNotFoundException;
import com.example.daystarter.integration.QuoteService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
@RequiredArgsConstructor
public class QuotesUseCaseImpl implements QuotesUseCase{
    private final Gson gson;

    private final QuoteService quoteService;

    @Override
    public QuoteResponse getQuote(String category) {
        Type responseType = new TypeToken<QuoteResponse>() {}.getType();

        String response = quoteService.getOneQuote(category);

        if(response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Category not available");
        }

    }
}
