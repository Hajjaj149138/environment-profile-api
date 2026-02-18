package com.hajjaj.api.service;

import com.hajjaj.api.dto.StatusResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Value("${app.message}")
    private String message;

    @Value("${app.api.url}")
    private String apiUrl;

    public StatusResponse getStatusInfo() {
        return new StatusResponse(message, apiUrl);
    }
}