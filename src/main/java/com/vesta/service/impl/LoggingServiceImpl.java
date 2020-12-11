package com.vesta.service.impl;

import com.vesta.service.LoggingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class LoggingServiceImpl implements LoggingService {
    @Override
    public void logRequest(HttpServletRequest httpServletRequest, Object body) {

    }

    @Override
    public void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object body) {

    }
}
