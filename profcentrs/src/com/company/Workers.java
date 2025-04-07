package com.company;

public class Workers {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String city;
    private int salary;
    private int workinghours;
    private String higheducation;

    public Workers(String name, String surname, int age, String gender, String city, int salary, int workinghours, String higheducation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.salary = salary;
        this.workinghours = workinghours;
        this.higheducation = higheducation;
    }

    public String printInfo() {
        String info = "Name - " + name + "\nsurname - " + surname + "\nage - " + age + " years\ngender - " + gender +
                "\ncity - " + city + "\nsalary - " + salary + " euros/month\nworking hours - " + workinghours +
                " hours/day\nhigher education - " + higheducation;
        return info;
    }
}
