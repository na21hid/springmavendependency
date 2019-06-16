package com.project.app.service.teacherservice;

import com.project.app.dto.HumanDTO;
import com.project.app.model.Human;
import com.project.app.reposiory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyTeacherservice implements TeacherService{

    @Autowired
    @Qualifier("teacher")
    Repository teacherRepository;

    @Override
    public HumanDTO read(int id) {
        Human human = teacherRepository.read(id);
        HumanDTO humanDTO = convertHumanToHumanDto(human);
        return humanDTO;

    }

    @Override
    public void write(HumanDTO humanDTO) {
        Human human = convertHumanDtoTohuman(humanDTO);
        teacherRepository.write(human);
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
