package com.productSync.AuthenticationUserService.dto;

import lombok.Data;

@Data
public class SigninRequest {
    private String email;
    private String password;
}
