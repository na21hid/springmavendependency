package com.project.app.model;

import javax.persistence.*;

@Entity
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id ;
    @Column
   private int age;
    @Column
   private String sex;
    @Column
   private double salary;
    @Column
   private String type;

    public Human(int id, int age, String sex, double salary, String type) {
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.type = type;
    }

    public Human() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }

}
