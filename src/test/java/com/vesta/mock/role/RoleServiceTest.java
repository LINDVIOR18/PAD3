package com.vesta.mock.role;

import com.vesta.common.RoleUtilData;
import com.vesta.repository.entity.RoleEntity;
import com.vesta.service.RolesService;
import com.vesta.service.impl.RolesServiceImpl;
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
public class RoleServiceTest {

    private RolesService rolesService;



    @Before
    public void setUp() {
        rolesService = new RolesServiceImpl();
    }

    @Test
    public void test_findByRoleName_validRoleName() {
        // given
        RoleEntity roleEntity = RoleUtilData.roleEntity();



        // then
        RoleEntity returnEntity = rolesService.findByName(roleEntity.getName());

        assertNotNull(returnEntity);
        assertThat(returnEntity.getId(), is(returnEntity.getId()));
        assertThat(returnEntity.getName(), is(returnEntity.getName()));

    }
}
