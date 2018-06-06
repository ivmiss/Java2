
package student;


import course.Course;

import computer.Computer;

public class Student {
    
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public Student(){
        this.course = new Course();
        this.computer = new Computer();
    }
    public Student(String firstName, String lastName, int yearOfBirth){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    
    public void Info(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Course name: " + );
        
        
        String getCourseName = null;
        System.out.println("Course name: " + getCourseName);
        int getNumberOfClasses = 0;
        System.out.println("Course number of classes: " + getNumberOfClasses);
        double getProcessTact = 0.0;
        System.out.println("Process tact: " + getProcessTact);
        double getMemory = 0.0;
        System.out.println("Memory: " + getMemory);
        int getHardDrive = 0;
        System.out.println("Hard drive: " + getHardDrive);
    }
    
    public Course getCourse(){
        return this.course;
    }
    
    public Computer getComputer(){
        return this.computer;
    }
}

