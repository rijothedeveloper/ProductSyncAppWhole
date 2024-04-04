package com.productSync.GatewayService.services;

import com.productSync.GatewayService.dto.*;

public interface AuthenticationService {
    SignupResponse signup(SignupRequest signupRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    EmailVerificationResponse verifyRegisterationEmail(String token);

}
