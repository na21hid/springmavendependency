package com.project.app.service;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import com.project.app.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyProgrammerService implements ProgrammerService {

    @Autowired
    HumanRepository programmerRepository;

    @Override
    public HumanDTO read(Long id) {
        Optional<Human> programmerOptional = programmerRepository.findById(id);
        if(programmerOptional.isPresent()){
            return convertHumanToHumanDto(programmerOptional.get());
        }
        return null;
    }

    @Override
    public void write(HumanDTO humanDTO) {
       Human human = convertHumanDtoToHuman(humanDTO);
    programmerRepository.save(human);

    }

    private HumanDTO convertHumanToHumanDto(Human human){
        HumanDTO humanDTO = new HumanDTO();
        humanDTO.setId(human.getId());
        humanDTO.setAge(human.getAge());
        humanDTO.setSex(human.getSex());
        humanDTO.setSalary(human.getSalary());
        humanDTO.setType(human.getType());
        return humanDTO;
    }
    private Human convertHumanDtoToHuman(HumanDTO humanDTO){
        Human human = new Human();
        human.setId(humanDTO.getId());
        human.setAge(humanDTO.getAge());
        human.setSex(humanDTO.getSex());
        human.setSalary(humanDTO.getSalary());
        human.setType(humanDTO.getType());
        return human;
    }
}
