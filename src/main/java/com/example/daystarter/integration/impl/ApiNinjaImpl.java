package com.example.daystarter.integration.impl;

import com.example.daystarter.integration.ApiConnection;
import com.example.daystarter.integration.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiNinjaImpl implements QuoteService {
    private final ApiConnection apiConnection;
    @Override
    public String getOneQuote(String category) {
        String url = "https://api.api-ninjas.com/v1/quotes?category="+category;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getQuotes(String category, String limit) {
        String url = "https://api.api-ninjas.com/v1/quotes?category="+category+"&limit"+limit;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getOneQuote() {
        String url = "https://api.api-ninjas.com/v1/quotes";
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }
}
