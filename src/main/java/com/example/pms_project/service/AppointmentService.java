package com.example.pms_project.service;

import com.example.pms_project.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    public String save(){

    }

}
