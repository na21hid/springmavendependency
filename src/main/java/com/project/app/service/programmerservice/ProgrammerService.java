package com.project.app.service.programmerservice;

import com.project.app.dto.HumanDTO;

public interface ProgrammerService {

    HumanDTO read(int id);
    void write(HumanDTO humanDTO);
}
