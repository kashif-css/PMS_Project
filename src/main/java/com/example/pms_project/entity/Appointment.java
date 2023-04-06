package com.example.pms_project.entity;
import jakarta.persistence.*;
import lombok.Data;

import javax.naming.Name;

@Entity
@Table(name = "Appointment")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "dateTime")
    private java.time.LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "Reseptionist_id")
    private Receptionist receptionist;
}
