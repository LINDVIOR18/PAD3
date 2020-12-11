package com.vesta.mock.floor;

import com.vesta.common.FloorUtilData;
import com.vesta.exception.VestaException;
import com.vesta.repository.entity.FloorEntity;
import com.vesta.service.FloorService;
import com.vesta.service.converter.FloorConverter;
import com.vesta.service.dto.FloorDto;
import com.vesta.service.impl.FloorServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FloorServiceTest {

    private FloorService floorService;

    private FloorConverter floorConverter = new FloorConverter();

    @Before
    public void setUp() {
        floorService = new FloorServiceImpl( floorConverter);
    }

    @Test
    public void test_findById_validId() {
        // given
        FloorEntity floorEntity = FloorUtilData.floorEntity();



        // then
        FloorDto returnDto = floorService.getById(floorEntity.getId());

        assertNotNull(returnDto);
        assertThat(floorEntity.getId(), is(returnDto.getId()));
        assertThat(floorEntity.getName(), is(returnDto.getName()));


    }

    @Test(expected = VestaException.class)
    public void test_findById_invalidId() {
        floorService.getById(null);
    }
}