package com.example.userregistrationlogin.service;

import com.example.userregistrationlogin.appuser.AppUser;
import com.example.userregistrationlogin.appuser.AppUserRole;
import com.example.userregistrationlogin.appuser.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private  final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());

        if(!isValidEmail) {
            throw new IllegalStateException("Email not valide");
        }

        return appUserService.signUpAppUser(
                new AppUser(
                        request.getLastName(),
                        request.getFirstName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
