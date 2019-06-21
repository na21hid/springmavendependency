package com.project.app.dto;

public class HumanDTO{

    private Long id ;
    private int age;
    private String sex;
    private double salary;
    private String type;

    public HumanDTO(Long id, int age, String sex, double salary, String type) {
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.type = type;
    }

    public HumanDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
