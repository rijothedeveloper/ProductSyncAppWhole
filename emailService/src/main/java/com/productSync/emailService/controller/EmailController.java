package com.productSync.emailService.controller;

import com.productSync.emailService.dto.RegisterationEmailRequest;
import com.productSync.emailService.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emailservice")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/status")
    public String getStatus(){
        return "Working";
    }
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody RegisterationEmailRequest registerationEmailRequest)
    {
        return emailService.sendVerificationEMail(registerationEmailRequest);

    }
}
