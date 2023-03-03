package com.example.pms_project.model;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patient_id;
    private String doctor_name;
    private String specialization;
    private long D_fee;
}
