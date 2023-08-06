package com.example.daystarter.features.quotes;

import com.example.daystarter.dto.response.QuoteResponse;

public interface QuotesUseCase {
    QuoteResponse getQuote(String category);
    QuoteResponse getRandomQuote();
    QuoteResponse getManyQuotes(String category, String limit);

}
