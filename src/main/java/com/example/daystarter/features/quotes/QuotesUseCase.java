package com.example.daystarter.features.quotes;

import com.example.daystarter.dto.response.QuoteResponse;

import java.util.List;

public interface QuotesUseCase {
    QuoteResponse getQuote(String category);
    QuoteResponse getRandomQuote();
    List<QuoteResponse> getManyQuotes(String category, String limit);

}
