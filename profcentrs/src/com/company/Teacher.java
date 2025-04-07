package com.company;

public class Teacher extends Workers {

    private int classes;
    private int consultation;
    private String predmet;


    public Teacher(String name, String surname, int age, String gender, String city,
                   int salary, int workinghours, String higheducation, int classes, int consultation, String predmet) {
        super(name, surname, age, gender, city, salary, workinghours, higheducation);
        this.classes = classes;
        this.consultation = consultation;
        this.predmet = predmet;
    }

    public String printInfo() {
        String info = super.printInfo() +
                "\n*classes - " + classes +
                "\n*consultation - " + consultation +
                "\n*Subject - " + predmet;
        return info;
    }
}