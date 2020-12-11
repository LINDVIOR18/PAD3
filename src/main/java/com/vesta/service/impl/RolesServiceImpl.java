package com.vesta.service.impl;

import com.vesta.repository.entity.RoleEntity;
import com.vesta.service.RolesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {


    @Override
    public RoleEntity findByName(String name) {
        log.info("method --- findByName");

        return null;
    }
}
