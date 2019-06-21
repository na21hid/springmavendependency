package com.project.app.service;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import com.project.app.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyTeacherservice implements TeacherService{

    @Autowired
    HumanRepository teacherRepository;

    @Override
    public HumanDTO read(Long id) {
        Optional<Human> teacherOptional = teacherRepository.findById(id);
        if(teacherOptional.isPresent()){
            return convertHumanToHumanDto(teacherOptional.get());
        }

        return null;

    }

    @Override
    public void write(HumanDTO humanDTO) {
        Human human = convertHumanDtoTohuman(humanDTO);
        teacherRepository.save(human);
    }



    private HumanDTO convertHumanToHumanDto(Human human){
     HumanDTO humanDTO = new HumanDTO();
        humanDTO.setId(human.getId());
        humanDTO.setAge(human.getAge());
        humanDTO.setSalary(human.getSalary());
        humanDTO.setType(human.getType());
        humanDTO.setSex(human.getSex());
        return humanDTO;
    }


    private Human convertHumanDtoTohuman(HumanDTO humanDTO){
        Human human = new Human();
        human.setId(humanDTO.getId());
        human.setAge(humanDTO.getAge());
        human.setSalary(humanDTO.getSalary());
        human.setSex(humanDTO.getSex());
        human.setType(humanDTO.getType());
        return human;
    }
}
