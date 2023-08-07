package com.example.daystarter.controllers;

import com.example.daystarter.dto.response.CryptoResponse;
import com.example.daystarter.dto.response.CryptoSymbolResponse;
import com.example.daystarter.features.crypto.CryptoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/crypto")
@RequiredArgsConstructor
public class CryptoController {
    private final CryptoUseCase cryptoUseCase;
    @GetMapping("/price/{symbol}")
    public ResponseEntity<CryptoResponse> getPrice(@PathVariable(name = "symbol") String symbol){
        CryptoResponse response = cryptoUseCase.getCryptoPrice(symbol);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/symbols")
    public ResponseEntity<List<CryptoSymbolResponse>> getSymbols(){
        List<CryptoSymbolResponse> response = cryptoUseCase.getCryptoSymbols();
        return ResponseEntity.ok(response);
    }




}
