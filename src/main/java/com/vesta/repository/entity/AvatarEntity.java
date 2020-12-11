package com.vesta.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvatarEntity {

    private Long id;
    private byte[] avatar;
    private String name;
    private UserEntity userEntity;
}
