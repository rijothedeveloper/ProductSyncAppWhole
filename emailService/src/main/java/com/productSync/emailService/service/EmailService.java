package com.productSync.emailService.service;

import com.productSync.emailService.dto.RegisterationEmailRequest;

public interface EmailService {
    String sendVerificationEMail(RegisterationEmailRequest registerationEmailRequest);
}
