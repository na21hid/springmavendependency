package com.project.app.service.programmerservice;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import com.project.app.reposiory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyProgrammerService implements ProgrammerService {

    @Autowired
    @Qualifier("programmer")
    Repository programmerRepository;

    @Override
    public HumanDTO read(int id) {
        Human human = programmerRepository.read(id);
        HumanDTO humanDTO = convertHumanToHumanDto(human);
        return humanDTO;
    }

    @Override
    public void write(HumanDTO humanDTO) {
       Human human = convertHumanDtoToHuman(humanDTO);
    programmerRepository.write(human);

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
