package com.example.userregistrationlogin.repository;

import com.example.userregistrationlogin.appuser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
