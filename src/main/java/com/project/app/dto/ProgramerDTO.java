package com.project.app.dto;

import com.project.app.model.Human;

public class Programer extends Human {

    public Programer(int id, int age, String sex, double salary,String type) {
        super(id, age, sex, salary, type);
    }


    @Override
    public String toString() {
        return super.toString();
    }

}