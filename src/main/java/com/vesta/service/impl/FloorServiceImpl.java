package com.vesta.service.impl;

import com.vesta.repository.entity.FloorEntity;
import com.vesta.service.FloorService;
import com.vesta.service.converter.FloorConverter;
import com.vesta.service.dto.FloorDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FloorServiceImpl implements FloorService {

    private final FloorConverter floorConverter;

    @Override
    public List<FloorDto> findAll() {
        log.info("method --- findAll");

        return null;
    }

    @Override
    public FloorDto getById(Long id) {
        log.info("method --- getById");

        return null;
    }

    @Override
    public void create(@Valid FloorDto floorDto) {
        log.info("method --- create");

        FloorEntity entity = floorConverter.deconvert(floorDto);
    }

    @Override
    public void delete(Long id) {
        log.info("method --- delete");

    }
}