package com.example.pms_project.model;

import lombok.Data;

@Data
public class PaymentModel {
    private Long id;
    private long bIllNo;

    private long bIllAmount;
    private java.time.LocalDateTime dateTime;

    public PaymentModel(Long id,long bIllNo,long bIllAmoun,java.time.LocalDateTime dateTime){
        this.bIllNo=bIllNo;
        this.bIllAmount=bIllAmoun;
        this.dateTime=dateTime;
    }
}
