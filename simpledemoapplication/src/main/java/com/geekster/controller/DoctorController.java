package com.geekster.controller;

import com.geekster.model.Doctor;
import com.geekster.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorServiceImpl doctorService;

    @PostMapping(value = "/doctor")
    public String saveDoctor(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping(value = "/doctor")
    public String getDoctor(@QueryParam("doctorName") String doctorName){

        return doctorService.getDoctor(doctorName);
    }



}
