package com.project.app.reposiory;

import com.project.app.model.Human;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@Qualifier("teacher")
public class TeacherRepository implements Repository {

    List<Human> humans = new LinkedList<Human>();



    @Override
    public Human read(int id) {
        for (int i = 0; i < humans.size() ; i++) {
            if (humans.get(i).getId() == id){
                return humans.get(i);
            }
        }
        return null;
    }

    @Override
        public void write (Human human){
            humans.add(human);
        }

        @Override
        public void printall (){
            for (int i = 0; i <humans.size() ; i++) {
                System.out.println(humans.get(i).toString());
            }
        }

    }
