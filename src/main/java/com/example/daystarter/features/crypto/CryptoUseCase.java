package com.example.daystarter.features.crypto;

import com.example.daystarter.dto.response.CryptoResponse;

public interface CryptoUseCase {

    CryptoResponse getCryptoPrice(String symbol);

}
