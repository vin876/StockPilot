package com.stockpilot.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/status")
    public StatusResponse verificarStatus() {
        return new StatusResponse(
            "StockPilot",
            "online",
            "Sistema funcionando corretamente"
        );
    }
}