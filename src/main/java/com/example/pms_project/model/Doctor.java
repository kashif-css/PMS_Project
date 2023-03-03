package com.example.pms_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctor_id;
    private String doctor_name;
    private String doctor_specialization;
    private  int doctor_fee;
    private int doctor_mobileno;
}
