package com.example.pms_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "address")
    private String address;
    @Column(name = "gender")
    private String gender;
    @Column(name = "mobile_no")
    private Long mobileNo;
    @Column(name = "disease_discription")
    private String diseaseDiscription;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;
    @OneToMany(mappedBy = "patient")
    private List<Payment>paymentList;
    @OneToMany(mappedBy = "patient")
    private List<Prescription>prescriptionList;
}