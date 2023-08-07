package com.example.daystarter.integration.impl;

import com.example.daystarter.integration.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiNinjaImpl implements QuoteService, FactService, EventService, CryptoService {
    private final ApiConnection apiConnection;

    @Override
    public String getOneQuote() {
        String url = "https://api.api-ninjas.com/v1/quotes";
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getOneQuote(String category) {
        String url = "https://api.api-ninjas.com/v1/quotes?category="+category;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getQuotes(String category, String limit) {
        String url = "https://api.api-ninjas.com/v1/quotes?category="+category+"&limit="+limit;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getManyEvents(String text, int year, int month, int day) {
        String url = "https://api.api-ninjas.com/v1/historicalevents?text="
                +text+"&year="+year+"&month="+month+"&day="+day;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getManyEventsByYear(int year) {
        String url = "https://api.api-ninjas.com/v1/historicalevents?year="+year;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getManyEventsByText(String text) {
        String url = "https://api.api-ninjas.com/v1/historicalevents?text="+text;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getManyEventsByMonth(int month) {
        String url = "https://api.api-ninjas.com/v1/historicalevents?month="+month;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getManyEventsByDay(int day) {
        String url = "https://api.api-ninjas.com/v1/historicalevents?day="+day;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getOneFact() {
        String url = "https://api.api-ninjas.com/v1/facts?limit=1";
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getFacts(int limit) {
        String url = "https://api.api-ninjas.com/v1/facts?limit="+"&limit";
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getPrice(String symbol) {
        String url = "https://api.api-ninjas.com/v1/cryptoprice?symbol="+symbol;
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }

    @Override
    public String getSymbols() {
        String url = "https://api.api-ninjas.com/v1/cryptosymbols?";
        return apiConnection.connectAndGet(url, HttpMethod.GET, String.class);
    }
}
