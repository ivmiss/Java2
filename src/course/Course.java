
package course;


public class Course {
    
    private String courseName;
    private int numberOfClasses;
    
    public Course(){
        this.courseName = "QA";
        this.numberOfClasses = 2;
    }
    
    public Course(String name, int numberOfClasses){
        this.courseName = name;
        this.numberOfClasses = numberOfClasses;
    }
    
    public void setCourseName(String name){
        this.courseName = name;
    }
    
    public void setNumberOfClasses(int numberOfClasses){
        this.numberOfClasses = numberOfClasses;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public int getNumberOfClasses(){
        return this.numberOfClasses;
    }
    
    
}
