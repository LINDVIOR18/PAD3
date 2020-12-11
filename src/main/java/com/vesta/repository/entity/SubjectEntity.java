package com.vesta.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectEntity {

    private Long id;
    private Float positionX;
    private Float positionY;
    private Float scale;
    private Boolean editable;
    private Float rotation;
    private Long floorId;
    private String additional;
    private SubjectTemplateEntity subjectTemplateEntity;
}
