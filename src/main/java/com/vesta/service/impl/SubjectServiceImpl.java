package com.vesta.service.impl;

import com.vesta.repository.entity.SubjectEntity;
import com.vesta.service.SubjectService;
import com.vesta.service.converter.SubjectConverter;
import com.vesta.service.dto.SubjectDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {


    private final SubjectConverter converter;

    @Override
    public SubjectDto getById(Long id) {
        log.info("method --- getByID");

        return null;
    }

    @Override
    public List<SubjectDto> getAll() {
        log.info("method ---getAll");

        return null;
    }

    @Override
    public void delete(Long id) {
        log.info("method --- delete");

    }

    @Override
    public void delete(List<Long> ids) {
        log.info("method --- delete");


    }

    @Override
    public List<SubjectDto> getByFloorId(Long floorId) {
        log.info("method --- getAllByFloorId");

        return null;
    }

    @Override
    public void create(SubjectDto dto) {
        log.info("method --- addSubject");

//        repository.save(converter.deconvert(dto));
    }

    //    @Transactional
    @Override
    public void create(List<SubjectDto> dtos) {
        log.info("method --- addSubjects");

        List<SubjectEntity> entities = dtos
                .stream()
                .map(converter::deconvert)
                .collect(Collectors.toList());
//        repository.saveAll(entities);
    }

    //    @Transactional
    @Override
    public SubjectDto update(Long id, SubjectDto dto) {
        log.info("method --- update");

        return null;
    }
}
