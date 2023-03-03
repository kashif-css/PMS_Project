package com.example.pms_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Admin_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Admin_id;
    private String Admin_email;
    private long Admin_mobileNo;
}
