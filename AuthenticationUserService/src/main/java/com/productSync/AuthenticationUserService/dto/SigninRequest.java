package com.productSync.AuthenticationUserService.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SigninRequest {
    @NotBlank(message = "Email is mandatory")
    @Size(min=6, message = "Email should be at least 6 characters long")
    private String email;
    @Size(min=6, message = "password should be at least 6 characters long")
    private String password;
}
