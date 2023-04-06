package com.example.pms_project.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.Map;

import java.util.List;

@Entity
@Table(name = "Doctor")
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "fee")
    private  int fee;
    @Column(name = "mobile_No")
    private Long mobileNo;
    @Column(name = "availabity")
    private String availabity;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment>appointmentList;
    @OneToMany(mappedBy = "doctor")
    private List<Prescription>prescriptionList;
    @ManyToOne
    @JoinColumn(name = "reseptionist_id")
    private Receptionist receptionist;
}
