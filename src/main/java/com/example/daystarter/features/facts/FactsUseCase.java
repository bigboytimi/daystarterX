package com.example.daystarter.features.facts;

import com.example.daystarter.dto.response.FactResponse;

import java.util.List;

public interface FactsUseCase {
    FactResponse getFact();
    List<FactResponse> getFacts(int limit);
}
