package com.example.pms_project.model;

import lombok.Data;

@Data
public class ReceptionistModel {
    private long id;

    private String email;

    public ReceptionistModel(Long id , String email){
        this.id=id;
        this.email=email;
    }
}

