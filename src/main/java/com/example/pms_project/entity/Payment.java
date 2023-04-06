package com.example.pms_project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payment")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bill_no")
    private long bIllNo;
    @Column(name = "dateTime")
    private java.time.LocalDateTime dateTime;
    @Column(name = "bill_Amount")
    private long bIllAmount;
    @ManyToOne
    @JoinColumn(name = "Patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "Reseptionist_id")
    private Receptionist receptionist;

}
