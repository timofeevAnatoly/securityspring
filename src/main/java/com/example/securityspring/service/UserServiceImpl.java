package com.example.securityspring.service;

import com.example.securityspring.dto.UserRegistrDto;
import com.example.securityspring.entity.Role;
import com.example.securityspring.entity.User;
import com.example.securityspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(UserRegistrDto registrDto) {
        User user = new User(registrDto.getFirsName(),registrDto.getEmail(),registrDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
