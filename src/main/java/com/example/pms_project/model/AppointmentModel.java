package com.example.pms_project.model;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
public class AppointmentModel {
    private Long Id;
    private java.time.LocalDateTime dateTime;

    public AppointmentModel(Long Id,java.time.LocalDateTime dateTime){
        this.Id=Id;
        this.dateTime=dateTime;
    }
}
