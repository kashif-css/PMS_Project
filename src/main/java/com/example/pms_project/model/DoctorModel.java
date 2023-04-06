package com.example.pms_project.model;

import com.example.pms_project.entity.Doctor;
import com.example.pms_project.entity.Receptionist;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

@Data
public class DoctorModel {
    private Long Id;
    private String name;
    private String specialization;
    private  int fee;
    @JsonBackReference
    private Receptionist receptionist;
    private Long mobileNo;
    private  String availabity;
    public Doctor disassemble(){
        Doctor doctor=new Doctor();
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setFee(fee);
        doctor.setMobileNo(mobileNo);
        doctor.setReceptionist(receptionist);
        doctor.setAvailabity(availabity);
        return doctor;
    }

    public DoctorModel asssemble(Doctor doctor){
        DoctorModel doctorModel = new DoctorModel();
        doctorModel.setId(doctor.getId());
        doctorModel.setName(doctor.getName());
        doctorModel.setSpecialization(doctor.getSpecialization());
        doctorModel.setFee(doctor.getFee());
        doctorModel.setMobileNo(doctor.getMobileNo());
        doctorModel.setReceptionist(doctor.getReceptionist());
        doctorModel.setAvailabity(doctor.getAvailabity());
        return doctorModel;
    }
}
