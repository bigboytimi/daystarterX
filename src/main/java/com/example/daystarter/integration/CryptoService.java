package com.example.daystarter.integration;

public interface CryptoService {
    String getPrice(String symbol);

    String getSymbols();
}
