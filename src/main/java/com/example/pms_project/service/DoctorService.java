package com.example.pms_project.service;

import com.example.pms_project.entity.Doctor;
import com.example.pms_project.model.DoctorModel;
import com.example.pms_project.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    public String save(DoctorModel doctorModel){
        Long mobileNo=doctorModel.getMobileNo();
        String status;
        Doctor exist=doctorRepository.findByMobileNo(mobileNo);
        if (exist!=null){
            status="Doctor is already register";
        }
        else {
            doctorRepository.save(doctorModel.disassemble());
            status="Doctor is registered";
        }
        return status;
    }

    public List<DoctorModel> getDoctorList() {
        List<DoctorModel> doctorModels = new ArrayList<>();
        for(Doctor doctor:doctorRepository.findAll()) {
            doctorModels.add(new DoctorModel().asssemble(doctor));
        }
        return doctorModels;
    }
}
