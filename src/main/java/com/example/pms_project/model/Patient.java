package com.example.pms_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patient_id;
    private String patient_name;
    private int patinet_age;
    private String patinet_address;
    private String patinet_gender;
    private int patinet_mobileno;

}