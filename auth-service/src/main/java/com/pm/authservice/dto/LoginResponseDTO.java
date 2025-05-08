package com.pm.authservice.dto;

public class LoginResponseDTO {
    private final String token;

    public LoginResponseDTO(String token) {
        this.token = token;
    }

    private String getToken() {
        return token;
    }
}
