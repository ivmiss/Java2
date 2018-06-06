package main;

import student.Student;

import course.Course;

import computer.Computer;

public class Main {

    public static void main(String[] args) {

        Student polaznik1 = new Student();
        polaznik1.setFirstName("Ivana");
        polaznik1.setLastName("VMilic");
        polaznik1.setYearOfBirth(1992);
        
        
        polaznik1.getCourse();
        polaznik1.getComputer();
        polaznik1.getComputer().setHardDrive(450);
        polaznik1.getCourse().setNumberOfClasses(1);
        
        polaznik1.Info();
        
    }

}
