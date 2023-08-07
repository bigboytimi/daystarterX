package com.example.daystarter.features.facts;

import com.example.daystarter.dto.response.FactResponse;
import com.example.daystarter.exceptions.IncompleteParameterException;
import com.example.daystarter.exceptions.RequestNotFoundException;
import com.example.daystarter.integration.FactService;
import com.example.daystarter.utils.GsonSingleton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FactsUseCaseImpl implements FactsUseCase{

    Gson gson = GsonSingleton.getInstance();
    private final FactService factService;
    @Override
    public FactResponse getFact() {
       Type responseType = new TypeToken<FactResponse>(){}.getType();

       String response = factService.getOneFact();

        if(response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Request Not Processed");
        }
    }

    @Override
    public List<FactResponse> getFacts(int limit) {

        if (limit <= 1 || limit > 30){
            throw new IncompleteParameterException("Limit must be more than 1 and below or equals 30");
        }
        Type responseType = new TypeToken<FactResponse>(){}.getType();

        String response = factService.getFacts(limit);

        if (response != null){
            return gson.fromJson(response, responseType);
        } else {
            throw new RequestNotFoundException("Request Not Processed");
        }
    }
}
