package com.example.pms_project.model;

import lombok.Data;

@Data
public class PrescriptionModel {

    private long id;
    private java.time.LocalDateTime dateTime;
    private String medicine;
    private String remarks;
    private String advice;

    public PrescriptionModel(Long id,java.time.LocalDateTime dateTime,String medicine,String remarks,String advice){
        this.id=id;
        this.dateTime=dateTime;
        this.medicine=medicine;
        this.remarks=remarks;
        this.advice=advice;
    }
}
