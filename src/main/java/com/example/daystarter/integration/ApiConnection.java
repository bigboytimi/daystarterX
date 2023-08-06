package com.example.daystarter.integration;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public interface ApiConnection {
    <T, R> R connectAndPost(T postBody, String url, HttpMethod method, Class<R> responseBody);
    <R> R connectAndGet(String url, HttpMethod method, Class<R> responseClass);
}
