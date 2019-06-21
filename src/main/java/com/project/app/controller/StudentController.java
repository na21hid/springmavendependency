package com.project.app.controller;


import com.project.app.dto.HumanDTO;
import com.project.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    HumanDTO getStudent(@PathVariable Long id){
        HumanDTO humanDTO = studentService.read(id);
        return humanDTO;
    }

    @RequestMapping(value = "/student",  method = RequestMethod.POST)
    @ResponseBody HumanDTO insertStudent(@RequestBody HumanDTO humanDTO){
        if("s".equals(humanDTO.getType())) {
            studentService.write(humanDTO);
        }
//        System.out.println(student.toString());
        return humanDTO;
    }

}