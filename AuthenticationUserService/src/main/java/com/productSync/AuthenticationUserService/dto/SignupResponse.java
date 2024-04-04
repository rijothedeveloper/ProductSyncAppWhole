package com.productSync.AuthenticationUserService.dto;

import com.productSync.AuthenticationUserService.entities.User;

public record SignupResponse(User user, String error) {
}
