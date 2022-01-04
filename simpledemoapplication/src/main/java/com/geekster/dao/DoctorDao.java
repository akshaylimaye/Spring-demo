package com.geekster.dao;

import com.geekster.model.Doctor;

public interface DoctorDao {
    String saveDoctor(Doctor doctor);

    String getDoctors(String doctorName);
}
