package com.company;

public class Builder extends Workers {

    private int buildings;
    private int time;
    private String exp;
    private String sphere;


    public Builder(String name, String surname, int age, String gender, String city,
                   int salary, int workinghours, String higheducation, int buildings, int time, String exp, String sphere ) {
        super(name, surname, age, gender, city, salary, workinghours, higheducation);
        this.buildings = buildings;
        this.time = time;
        this.exp = exp;
        this.sphere = sphere;
    }

    public String printInfo() {
        String info = super.printInfo() +
                "\n*Number of buildings constructed - " + buildings + " buildings"+
                "\n*Works as a builder - " + time +" years"+
                "\n*Experience in solving engineering problems - " + exp+
                "\n*Sphere - "+sphere;
        return info;
    }
}