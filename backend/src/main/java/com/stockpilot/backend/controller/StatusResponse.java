package com.stockpilot.backend.controller;

public class StatusResponse {

    private String sistema;
    private String status;
    private String mensagem;

    public StatusResponse(String sistema, String status, String mensagem) {
        this.sistema = sistema;
        this.status = status;
        this.mensagem = mensagem;
    }

    public String getSistema() {
        return sistema;
    }

    public String getStatus() {
        return status;
    }

    public String getMensagem() {
        return mensagem;
    }
}