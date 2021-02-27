package com.example.userregistrationlogin.service;

import com.example.userregistrationlogin.repository.ConfirmationTokenRepository;
import com.example.userregistrationlogin.token.ConfirmationToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token) {
        boolean tokenExists = confirmationTokenRepository.findByToken(token.getToken()).isPresent();

        if(tokenExists) {
            throw new IllegalStateException("Token exist");
        }

        confirmationTokenRepository.save(token);
    }
}
