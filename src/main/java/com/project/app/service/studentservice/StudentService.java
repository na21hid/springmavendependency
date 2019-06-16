package com.project.app.service.studentservice;

import com.project.app.dto.HumanDTO;


public interface StudentService {

    HumanDTO read(int id);
    void write(HumanDTO humanDTO);
}
