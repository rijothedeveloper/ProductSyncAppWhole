package com.productSync.AuthenticationUserService.services;

import com.productSync.AuthenticationUserService.dto.*;

public interface AuthenticationService {
    SignupResponse signup(SignupRequest signupRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    EmailVerificationResponse verifyRegisterationEmail(String token);

}
