package com.example.userregistrationlogin.service;

import com.example.userregistrationlogin.appuser.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "Works";
    }
}
