package com.example.pms_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long BIllNo;
    private long patient_id;
    private long BIll_amount;
}
