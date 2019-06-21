package com.project.app.service;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import com.project.app.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyStudentService implements StudentService {

    @Autowired
    HumanRepository studentRepository;

@Override
    public HumanDTO read(Long id) {
        Optional<Human> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return convertHumanToHumanDTO(studentOptional.get());
        }else {
            return null;
        }
    }

@Override
    public void write(HumanDTO humandto) {
        Human human = convertHumanDTOtoHuman(humandto);
        studentRepository.save(human);
    }


    private Human convertHumanDTOtoHuman(HumanDTO humanDTO){
        Human human = new Human();
        human.setId(humanDTO.getId());
        human.setAge(humanDTO.getAge());
        human.setSalary(humanDTO.getSalary());
        human.setSex(humanDTO.getSex());
        human.setType(humanDTO.getType());
        return human;
    }

    private HumanDTO convertHumanToHumanDTO(Human human){
        HumanDTO humanDTO = new HumanDTO();
        humanDTO.setId(human.getId());
        humanDTO.setAge(human.getAge());
        humanDTO.setSalary(human.getSalary());
        humanDTO.setType(human.getType());
        humanDTO.setSex(human.getSex());
        return humanDTO;
    }
}
