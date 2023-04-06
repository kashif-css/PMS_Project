package com.example.pms_project.controller;

import com.example.pms_project.model.PatientModel;
import com.example.pms_project.service.PatientService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pms")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/patient-reg")
    public String save(@RequestBody PatientModel patientModel){
        return patientService.reg(patientModel);
    }
    @PostMapping("/login")
    public String login(HttpServletRequest  req)
    {

       return patientService.login(req.getHeader("email"), req.getHeader("password"));
    }
}
