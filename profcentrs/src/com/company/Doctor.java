package com.company;

public class Doctor extends Workers {

    private int number;
    private int time;
    private String know;
    private String sphereandwhatcured;


    public Doctor(String name, String surname, int age, String gender, String city,
                   int salary, int workinghours, String higheducation, int number, int time, String know, String sphereandwhatcured ) {
        super(name, surname, age, gender, city, salary, workinghours, higheducation);
        this.number = number;
        this.time = time;
        this.know = know;
        this.sphereandwhatcured = sphereandwhatcured;
    }

    public String printInfo() {
        String info = super.printInfo() +
                "\n*Number of patients cured - " + number + " patients"+
                "\n*Studied to become a doctor - " + time +" years"+
                "\n*Knows how to treat people - " + know+
                "\n*The scope of the doctor and what he treats- "+sphereandwhatcured;
        return info;
    }
}