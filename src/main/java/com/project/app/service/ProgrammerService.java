package com.project.app.service;

import com.project.app.dto.HumanDTO;

public interface ProgrammerService {

    HumanDTO read(Long id);
    void write(HumanDTO humanDTO);
}
