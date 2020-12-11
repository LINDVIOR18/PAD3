package com.vesta.service.impl;

import com.vesta.controller.view.Token;
import com.vesta.service.TokenService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@Slf4j
@Service
public class TokenServiceImpl implements TokenService {

    @Value("${vesta.access.expiration}")
    private Long accessExpiration;

    @Value("${vesta.refresh.expiration}")
    private Long refreshExpiration;

    @Value("${vesta.email.expiration}")
    private Long emailExpiration;

    @Override
    public Token generatedAccessToken(String username) {
        log.info("method --- generatedAccessToken");

        return null;
    }

    @Override
    public Token generatedRefreshToken(String username) {
        log.info("method --- generatedRefreshToken");

        return null;
    }

    @Override
    public Token generatedEmailToken(String username) {
        log.info("method --- generatedEmailToken");

        return null;
    }

    @Override
    public String getSubject(String token) {
        return null;
    }

    @Override
    public String getSubject(HttpServletRequest request) {


        return null;
    }

    @Override
    public String getRefreshSubject(String token) {
        log.info("method --- getRefreshSubject");

        return null;
    }

    private String buildSubject(String token, String secret) {
        return null;
    }

    private Token buildToken(String username, Long expirationTime, String secret, String prefix) {
        String jwt = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        return new Token(prefix + jwt);
    }
}