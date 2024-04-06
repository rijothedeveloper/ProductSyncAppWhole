package com.productSync.AuthenticationUserService.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignupRequest {
    @Size(min=3, message = "First Name should be at least 3 characters long")
    private String firstName;
    @Size(min=3, message = "Last Name should be at least 3 characters long")
    private String lastName;
    @NotBlank(message = "Email is mandatory")
    @Size(min=6, message = "Email should be at least 6 characters long")
    private String email;
    @Size(min=6, message = "password should be at least 6 characters long")
    private String password;
}
