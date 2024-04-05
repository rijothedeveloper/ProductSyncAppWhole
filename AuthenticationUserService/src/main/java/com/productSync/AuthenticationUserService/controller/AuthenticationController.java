package com.productSync.AuthenticationUserService.controller;

import com.productSync.AuthenticationUserService.dto.*;
import com.productSync.AuthenticationUserService.services.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/status")
    public String getStatus(){
        return "Working";
    }
    @GetMapping("/verify_user_email")
    public ResponseEntity<EmailVerificationResponse> veifyUserEmail(@RequestParam String token){
        return ResponseEntity.ok(authenticationService.verifyRegisterationEmail(token));
    }

    @PostMapping("/signup")
    @CrossOrigin
    public ResponseEntity<SignupResponse> signup(@RequestBody SignupRequest signupRequest) {
//        return ResponseEntity.ok(authenticationService.signup(signupRequest));
        return new ResponseEntity<>(authenticationService.signup(signupRequest), HttpStatus.CREATED);
    }
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest) {
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }
    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }

}
