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

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserConverter userConverter;
    private final TokenService tokenService;
    private final PasswordEncoder passwordEncoder;
    private final RolesService rolesService;
    private final EmailService emailService;

    @Override
    public UserDto getById(Long id) {
        log.info("method --- getById");

        return null;
    }

    @Override
    public List<UserDto> findAll() {
        log.info("method --- findAll");

        return null;
    }

    @Override
    public void create(UserDto userDto) {
        log.info("method --- create");

    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        log.info("method --- update");

        return null;
    }

    @Override
    public void forgotPasswordMail(String email) {
        log.info("method --- forgotPasswordMail");

    }

    @Override
    public void resetForgotPassword(String token, String password) {
        log.info("method --- resetForgotPassword");


    }

    @Override
    public void delete(Long id) {
        log.info("method --- delete");


    }

    @Override
    public UserDto getByUsername(String username) {
        log.info("method --- getByUsername");

        return null;
    }

    @Override
    public Map<String, String> login(AccountCredential accountCredential) {
        log.info("method --- login");


        return null;
    }

    @Override
    public Token refreshToken(String refreshToken) {
        log.info("method --- refreshToken");

        return tokenService.generatedAccessToken(tokenService.getRefreshSubject(refreshToken));
    }
}
