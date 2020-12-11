package com.vesta.mock.subject;

import com.vesta.common.SubjectTemplateUtilData;
import com.vesta.exception.VestaException;
import com.vesta.repository.entity.SubjectTemplateEntity;
import com.vesta.service.SubjectTemplateService;
import com.vesta.service.converter.SubjectTemplateConverter;
import com.vesta.service.dto.SubjectTemplateDto;
import com.vesta.service.impl.SubjectTemplateServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SubjectTemplateTest {

    private SubjectTemplateService service;


    private SubjectTemplateConverter converter = new SubjectTemplateConverter();

    @Before
    public void setUp() {
        service = new SubjectTemplateServiceImpl( converter);
    }

    @Test
    public void getById_Valid() {
        // given
        SubjectTemplateEntity subjectTemplateEntity = SubjectTemplateUtilData.subjectTemplateEntity();

        // when


        // then
        service.getById(subjectTemplateEntity.getId());

    }

    @Test(expected = VestaException.class)
    public void getById_Invalid() {
        service.getById(null);
    }

    @Test
    public void deleteById_Succes() {
        // given
        SubjectTemplateEntity subjectTemplateEntity = SubjectTemplateUtilData.subjectTemplateEntity();
        // when
        service.delete(subjectTemplateEntity.getId());
        // then

    }

    @Test
    public void addImage_Success() {
        // given
        SubjectTemplateDto subjectTemplateDto = new SubjectTemplateDto();
        subjectTemplateDto.setImage("test-image");

        service.create(subjectTemplateDto);
    }

    @Test
    public void findAll_Images() {
        // given
        SubjectTemplateEntity subjectTemplateEntity = SubjectTemplateUtilData.subjectTemplateEntity();
        // when

        List<SubjectTemplateDto> subjectTemplates = service.getAll();

        Assert.assertEquals(subjectTemplates.size(), 1);
        Assert.assertEquals(subjectTemplates.get(0).getImage(), subjectTemplateEntity.getImage());
    }
}