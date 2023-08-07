package com.example.daystarter.features.quotes;

import com.example.daystarter.dto.response.QuoteResponse;
import com.example.daystarter.exceptions.RequestNotFoundException;
import com.example.daystarter.integration.QuoteService;
import com.example.daystarter.utils.GsonSingleton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuotesUseCaseImpl implements QuotesUseCase{
    Gson gson = GsonSingleton.getInstance();

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

    @Override
    public QuoteResponse getRandomQuote() {
        Type responseType = new TypeToken<QuoteResponse>() {}.getType();

        String response = quoteService.getOneQuote();

        if(response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Category not available");
        }
    }

    @Override
    public List<QuoteResponse> getManyQuotes(String category, String limit) {
        Type responseType = new TypeToken<List<QuoteResponse>>() {}.getType();

        String response = quoteService.getQuotes(category, limit);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Category not available");
        }
    }
}
