package com.vesta.service.impl;

import com.vesta.service.CompanyService;
import com.vesta.service.converter.CompanyConverter;
import com.vesta.service.converter.FloorConverter;
import com.vesta.service.dto.CompanyDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {


    private final CompanyConverter companyConverter;
    private final FloorConverter floorConverter;


    @Override
    public List<CompanyDto> findAll() {
        log.info("method --- findAll");

        return null;
    }

    @Override
    public CompanyDto getByName(String name) {
        log.info("method --- getByName");

        return null;
    }

    @Override
    public void create(CompanyDto companyDto) {
        log.info("method --- create");

    }

    @Override
    public CompanyDto findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}

