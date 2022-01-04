package com.geekster.service;

import com.geekster.dao.DoctorDao;
import com.geekster.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorDao doctorDao;

    @Override
    public String saveDoctor(Doctor doctor) {
        if(null != doctor){
            if(null != doctor.getAge()){
                int age = doctor.getAge();
                if(age > 30){
                    return doctorDao.saveDoctor(doctor);
                }
            }

        }
        return "doctor can't be saved";
    }

    public String getDoctor(String doctorName) {
        return doctorDao.getDoctors(doctorName);
    }
}
