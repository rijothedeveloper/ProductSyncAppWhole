package com.productSync.AuthenticationUserService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationResponse {
    private String token;
    private String refreshToken;
    private Map<String, String> error;
}
