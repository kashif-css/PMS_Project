package com.example.pms_project.controller;

import com.example.pms_project.entity.Doctor;
import com.example.pms_project.model.DoctorModel;
import com.example.pms_project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pms")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @PostMapping("/doctorreg")
    public String save(@RequestBody DoctorModel doctorModel){
        return doctorService.save(doctorModel);
    }

    @GetMapping("/doctorsList")
    public List<DoctorModel> getListOfDoctors()
    {
        return doctorService.getDoctorList();
    }
}
