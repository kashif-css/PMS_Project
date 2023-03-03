package com.example.pms_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patient_id;
    private long doctor_id;
    private String medicine;
    private String remarks;
    private String advice;
}
