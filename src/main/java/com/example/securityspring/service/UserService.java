package com.example.securityspring.service;

import com.example.securityspring.dto.UserRegistrDto;
import com.example.securityspring.entity.User;

public interface UserService {
    User save(UserRegistrDto registrDto);

}
