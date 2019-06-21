package com.project.app.service.studentservice;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyStudentService implements StudentService {

    @Autowired
    @Qualifier("student")
    Repository studentRepository;

    @Override
    public HumanDTO read(int id) {
        Human human = studentRepository.read(id);
        HumanDTO humanDTO = convertHumanToHumanDTO(human);
        return humanDTO;
    }

    @Override
    public void write(HumanDTO humandto) {
        Human human = convertHumanDTOtoHuman(humandto);
        studentRepository.write(human);
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
