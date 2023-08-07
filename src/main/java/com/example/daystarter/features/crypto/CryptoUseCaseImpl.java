package com.example.daystarter.features.crypto;

import com.example.daystarter.dto.response.CryptoResponse;
import com.example.daystarter.dto.response.CryptoSymbolResponse;
import com.example.daystarter.exceptions.RequestNotFoundException;
import com.example.daystarter.integration.CryptoService;
import com.example.daystarter.utils.GsonSingleton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CryptoUseCaseImpl implements CryptoUseCase{

    private final CryptoService cryptoService;

    Gson gson = GsonSingleton.getInstance();

    @Override
    public CryptoResponse getCryptoPrice(String symbol) {
        Type responseType = new TypeToken<CryptoResponse>(){}.getType();

        String response = cryptoService.getPrice(symbol);

        if (!response.toLowerCase().contains("error")){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Error: Please check your symbol and try again");
        }

    }

    @Override
    public List<CryptoSymbolResponse> getCryptoSymbols() {
        Type responseType = new TypeToken<List<CryptoSymbolResponse>>(){}.getType();

        String response = cryptoService.getSymbols();

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Request Failed");
        }
    }
}
