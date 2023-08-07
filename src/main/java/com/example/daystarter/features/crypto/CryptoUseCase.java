package com.example.daystarter.features.crypto;

import com.example.daystarter.dto.response.CryptoResponse;
import com.example.daystarter.dto.response.CryptoSymbolResponse;

import java.util.List;

public interface CryptoUseCase {

    CryptoResponse getCryptoPrice(String symbol);

    List<CryptoSymbolResponse> getCryptoSymbols();

}
