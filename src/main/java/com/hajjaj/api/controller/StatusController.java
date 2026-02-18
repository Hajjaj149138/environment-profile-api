package com.hajjaj.api.controller;

import com.hajjaj.api.dto.ApiResponse;
import com.hajjaj.api.dto.StatusResponse;
import com.hajjaj.api.service.WelcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StatusController {

    private final WelcomeService welcomeService;

    public StatusController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/status")
    public ResponseEntity<ApiResponse<StatusResponse>> getStatus() {
        StatusResponse data = welcomeService.getStatusInfo();

        ApiResponse<StatusResponse> response = ApiResponse.<StatusResponse>builder()
                .success(true)
                .message("Environment status fetched successfully")
                .data(data)
                .build();

        return ResponseEntity.ok(response);
    }
}