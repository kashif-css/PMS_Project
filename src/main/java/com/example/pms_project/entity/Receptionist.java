package com.example.pms_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Reseptionist")
@Data
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private  String password;
    @OneToMany(mappedBy = "receptionist")
    private List<Doctor>doctorList;
    @OneToMany(mappedBy = "receptionist")
    private List<Payment>paymentList;
    @OneToMany(mappedBy = "receptionist")
    private List<Appointment>appointmentList;
}
