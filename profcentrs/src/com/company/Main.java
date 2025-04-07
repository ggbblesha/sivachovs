package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program ''Worker data storage'' ");
        System.out.print("Enter the name of the profession (Teacher, Builder, Doctor): ");
        String pr = sc.nextLine();

        /*
        teacher - Ludmila Sivachova, Irina Dzina, Walter White
        builder - Bob Worker, Avanti Ulanti, Liz Diller
        doctor - Yevgenijs Sivachovs, Dmitrijs Singarevs, Yelena Pozarska
        */

        try (FileWriter fw = new FileWriter("professions.txt", true)) {

            if ("teacher".equalsIgnoreCase(pr)) {
                System.out.print("Teacher's name (Ludmila Sivachova, Irina Dzina, Walter White): ");
                String tch = sc.nextLine();
                System.out.println(" ");

                if ("Ludmila Sivachova".equalsIgnoreCase(tch)) {
                    Teacher t1 = new Teacher("Ludmila", "Sivačova", 52, "Woman",
                            "Daugavpils", 900, 2, "Высшее логопедическое, высшее учительское", 3, 0, "Logopede");
                    System.out.println(t1.printInfo());
                    fw.write(t1.printInfo() + "\n");
                } else if ("Irina Dzina".equalsIgnoreCase(tch)) {
                    Teacher t2 = new Teacher("Irina", "Dzina", 42, "Woman",
                            "Riga", 1200, 6, "Высшее музыкальное", 9, 4, "Solfedzo skolotaja");
                    System.out.println(t2.printInfo());
                    fw.write(t2.printInfo() + "\n");
                } else if ("Walter White".equalsIgnoreCase(tch)) {
                    Teacher t3 = new Teacher("Walter", "White", 51, "Man",
                            "Albuquerque", 5500, 8, "Высшее химическое", 7, 5, "Chemistry");
                    System.out.println(t3.printInfo());
                    fw.write(t3.printInfo() + "\n");
                } else {
                    System.out.println("Unknown teacher");
                }
            } else if ("builder".equalsIgnoreCase(pr)) {
                System.out.print("Builder's name (Bob Worker, Avanti Ulanti, Liz Diller): ");
                String bul = sc.nextLine();
                System.out.println(" ");

                if ("Bob Worker".equalsIgnoreCase(bul)) {
                    Builder b1 = new Builder("Bob", "Worker", 35, "Man",
                            "New-York", 7500, 8, "Высшее инженерное", 7, 4, "Yes", "Engineering");
                    System.out.println(b1.printInfo());
                    fw.write(b1.printInfo() + "\n");
                } else if ("Avanti Ulanti".equalsIgnoreCase(bul)) {
                    Builder b2 = new Builder("Avanti", "Ulanti", 47, "Man",
                            "Hong Kong", 1500, 12, "No", 46, 27, "No", "Plumbing");
                    System.out.println(b2.printInfo());
                    fw.write(b2.printInfo() + "\n");
                } else if ("Liz Diller".equalsIgnoreCase(bul)) {
                    Builder b3 = new Builder("Elizabet", "Diller", 69, "Woman",
                            "Moskow", 14650, 7, "Высшее архитекторное", 34, 20, "No", "Архитектор");
                    System.out.println(b3.printInfo());
                    fw.write(b3.printInfo() + "\n");
                } else {
                    System.out.println("Unknown builder");
                }
            } else if ("doctor".equalsIgnoreCase(pr)) {
                System.out.print("Doctor's name (Yevgenijs Sivachovs, Dmitrijs Singarevs, Yelena Pozarska): ");
                String dct = sc.nextLine();
                System.out.println(" ");

                if ("Yevgenijs Sivachovs".equalsIgnoreCase(dct)) {
                    Doctor d1 = new Doctor("Yevgenijs", "Sivačovs", 54, "Man", "Daugavpils",
                            1234, 8, "Высшее медицинское", 5000, 6, "Yes", "Гинекология, принимает роды");
                    System.out.println(d1.printInfo());
                    fw.write(d1.printInfo() + "\n");
                } else if ("Dmitrijs Singarevs".equalsIgnoreCase(dct)) {
                    Doctor d2 = new Doctor("Dmitrijs", "Šingarevs", 53, "Man", "Daugavpils", 1234,
                            8, "Высшее зубное", 1345, 4, "No", "Зубной врач, лечит зубы");
                    System.out.println(d2.printInfo());
                    fw.write(d2.printInfo() + "\n");
                } else if ("Yelena Pozarska".equalsIgnoreCase(dct)) {
                    Doctor d3 = new Doctor("Yelena", "Požarska", 61, "Woman", "Riga", 3500,
                            5, "Высшее медицинское", 450, 4, "Yes", "Семейный врач, любые болезни");
                    System.out.println(d3.printInfo());
                    fw.write(d3.printInfo() + "\n");
                } else {
                    System.out.println("Unknown doctor");
                }
            } else {
                System.out.println("Unknown profession");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

