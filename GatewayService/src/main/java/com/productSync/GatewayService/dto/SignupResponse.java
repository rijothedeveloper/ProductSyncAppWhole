package com.productSync.GatewayService.dto;

import com.productSync.GatewayService.entities.User;

public record SignupResponse(User user, String error) {
}
