package com.example.pms_project.model;

import com.example.pms_project.entity.Patient;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class PatientModel {
    private Long id;
    private String email;
    private String password;

    private String name;
    private Integer age;
    private String address;
    private String gender;
    private Long mobileNo;
    private String diseaseDiscription;

    public Patient disassemble(){
        Patient patient=new Patient();
        patient.setEmail(email);
        patient.setPassword(password);
        patient.setName(name);
        patient.setAddress(address);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setMobileNo(mobileNo);
        patient.setDiseaseDiscription(diseaseDiscription);
        return patient;
    }
}
