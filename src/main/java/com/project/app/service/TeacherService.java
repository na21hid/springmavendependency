package com.project.app.service.teacherservice;

import com.project.app.dto.HumanDTO;

public interface TeacherService {
    HumanDTO read(int id);
    void write(HumanDTO humanDTO);
}
