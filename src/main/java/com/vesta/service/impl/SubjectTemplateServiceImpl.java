package com.vesta.service.impl;

import com.vesta.repository.entity.SubjectTemplateEntity;
import com.vesta.service.SubjectTemplateService;
import com.vesta.service.converter.SubjectTemplateConverter;
import com.vesta.service.dto.SubjectTemplateDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class SubjectTemplateServiceImpl implements SubjectTemplateService {


    private final SubjectTemplateConverter converter;

    @Override
    public SubjectTemplateDto getById(Long id) {
        log.info("method --- getByID");

        return null;
    }

    @Override
    public void create(SubjectTemplateDto subjectTemplateDto) {
        log.info("method --- createImage");

        SubjectTemplateEntity subjectTemplateEntity = converter.deconvert(subjectTemplateDto);
//        subjectTemplateRepository.save(subjectTemplateEntity);
    }

    @Override
    public void delete(Long id) {
        log.info("method --- deleteImage");


    }

    @Override
    public List<SubjectTemplateDto> getAll() {
        log.info("method --- findAll");

        return null;
    }
}
