package com.example.daystarter.dto.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CryptoResponse {
    private String symbol;
    private String price;
    private String timestamp;

    public CryptoResponse(String symbol, String price) {
        this.symbol = symbol;
        this.price = price;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
