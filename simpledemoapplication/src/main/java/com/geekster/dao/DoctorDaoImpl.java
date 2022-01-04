package com.geekster.dao;

import com.geekster.model.Doctor;
import com.geekster.utils.Utiltiy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDaoImpl implements DoctorDao{

     List<String> doctorList = new ArrayList<>();

    @Override
    public String saveDoctor(Doctor doctor) {
        doctorList.add(doctor.getFirstName());

        //Using and without using static in utilty
        Utiltiy util = new Utiltiy();
        util.saveDoc(doctor.getFirstName());

        return doctor.getFirstName()+" doctor saved";

    }

    @Override
    public String getDoctors(String doctorName) {
        if(null != doctorName && doctorList.contains(doctorName)){
            return doctorName;
        }
        return String.join(",",doctorList);
    }
}
