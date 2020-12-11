package com.vesta.service.impl;

import com.vesta.controller.view.Token;
import com.vesta.service.EmailService;
import com.vesta.service.RolesService;
import com.vesta.service.TokenService;
import com.vesta.service.UserService;
import com.vesta.service.converter.UserConverter;
import com.vesta.service.dto.AccountCredential;
import com.vesta.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    @Override
    public UserDto getById(Long id) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public void create(@Valid UserDto userDto) {

    }

    @Override
    public UserDto update(Long id, @Valid UserDto userDto) {
        return null;
    }

    @Override
    public void resetForgotPassword(String token, String password) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserDto getByUsername(String username) {
        return null;
    }

    @Override
    public Map<String, String> login(AccountCredential accountCredential) {
        return null;
    }

    @Override
    public Token refreshToken(String refreshToken) {
        return null;
    }

    @Override
    public void forgotPasswordMail(String email) {

    }
}
