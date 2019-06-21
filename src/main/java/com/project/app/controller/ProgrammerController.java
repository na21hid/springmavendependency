package com.project.app.controller.programmercontroller;

import com.project.app.dto.HumanDTO;
import com.project.app.service.programmerservice.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class ProgrammerController {

    @Autowired
    ProgrammerService programmerService;


    @GetMapping("/programmer/{id}")
    @ResponseBody
    HumanDTO getProgrammer(@PathVariable int id){
        HumanDTO humanDTO = programmerService.read(id);
        return humanDTO;
    }


    @PostMapping("programmer")
    @ResponseBody HumanDTO insertProgrammer(@RequestBody HumanDTO huamnDto){
        if("p".equals(huamnDto.getType())){
            programmerService.write(huamnDto);
        }
        return huamnDto;
    }
}
