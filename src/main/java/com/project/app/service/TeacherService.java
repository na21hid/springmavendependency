package com.project.app.service;

import com.project.app.dto.HumanDTO;

public interface TeacherService {
    HumanDTO read(Long id);
    void write(HumanDTO humanDTO);
}
