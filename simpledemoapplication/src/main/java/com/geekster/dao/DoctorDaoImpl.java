package com.geekster.dao;

import com.geekster.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDaoImpl implements DoctorDao{

    List<String> doctorList = new ArrayList<>();

    @Override
    public String saveDoctor(Doctor doctor) {
        doctorList.add(doctor.getFirstName());
        return doctor.getFirstName()+" doctor saved";
    }
}
