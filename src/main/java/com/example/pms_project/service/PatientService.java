package com.example.pms_project.service;

import com.example.pms_project.entity.Patient;
import com.example.pms_project.model.PatientModel;
import com.example.pms_project.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public String reg(PatientModel patientModel){
        Long mobileNo=patientModel.getMobileNo();
        String status;
        Patient exist=patientRepository.findByMobileNo(mobileNo);
        if (exist!=null){
            status="patient is already register";
        }
        else {
            patientRepository.save(patientModel.disassemble());
            status="Patient is registered";
        }
        return status;
    }
    public String login(String email,String password){
        String result;
        Patient patientExist=    patientRepository.findByEmailAndPassword(email,password);
        if(patientExist!=null){
            result = "login successful";
        }
        else {
            result=" Invalid credentials";
        }
        return  result;
    }
}
