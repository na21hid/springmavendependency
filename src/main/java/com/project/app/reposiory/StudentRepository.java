package com.project.app.reposiory;

import com.project.app.model.Human;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("student")
public class StudentRepository implements Repository {



   private List<Human> humans = new ArrayList<>();

    @Override
    public Human read(int id) {

        for (int i = 0; i < humans.size() ; i++) {
            if(humans.get(i).getId() == id){
//                 Human human = humans.get(i);
//                 return  human;
               return humans.get(i);
            }
        }


        return null;
    }

    @Override
    public void write(Human human) {
        humans.add(human);
        }


    @Override
    public void printall() {
        for (int i = 0; i < humans.size() ; i++) {
            System.out.println( humans.get(i).toString());
        }
    }

}
