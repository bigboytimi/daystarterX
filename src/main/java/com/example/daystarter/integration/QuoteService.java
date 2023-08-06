package com.example.daystarter.integration;

public interface QuoteService {
    String getOneQuote();
    String getOneQuote(String category);
    String getQuotes(String category, String limit);
}
