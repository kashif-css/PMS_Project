package com.example.pms_project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Prescription")
@Data
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "dateTime")
    private java.time.LocalDateTime dateTime;
    @Column(name = "medicine")
    private String medicine;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "advice")
    private String advice;
    @ManyToOne
    @JoinColumn(name = "Patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    private Doctor doctor;
}