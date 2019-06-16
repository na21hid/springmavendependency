package com.project.app.controller;


import com.project.app.model.Human;
import com.project.app.service.studentservice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody Human getStudent(@PathVariable int id){
        Human human = studentService.read(id);
        return human;
    }

    @RequestMapping(value = "/student",  method = RequestMethod.POST)
    @ResponseBody Human insertStudent(@RequestBody Human human){
        if("s".equals(human.getType())) {
            studentService.write(human);
        }
//        System.out.println(student.toString());
        return human;
    }

}