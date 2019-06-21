package com.project.app.controller;

import com.project.app.dto.HumanDTO;
import com.project.app.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher/{id}")
    @ResponseBody
    HumanDTO getTeacher(@PathVariable Long id){
        HumanDTO humanDTO = teacherService.read(id);
        return humanDTO;
    }

    @PostMapping("/teacher")
    @ResponseBody HumanDTO insertTeacher(@RequestBody HumanDTO humanDTO){
        if ("t".equals(humanDTO.getType())){
            teacherService.write(humanDTO);
        }
        return humanDTO;
    }
}