package com.example.pms_project.controller;

import com.example.pms_project.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;



}
