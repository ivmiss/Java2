
package course;


public class Course {
    
    public char name;
    private int numberOfClasses;
    
    public Course(char name, int numberOfClasses){
        this.name = name;
        this.numberOfClasses = numberOfClasses;
    }
    
    public void setName(char name){
        this.name = name;
    }
    
    public void setNumberOfClasses(int numberOfClasses){
        this.numberOfClasses = numberOfClasses;
    }
    
    public char getName(){
        return this.name;
    }
    
    public int getNumberOfClasses(){
        return this.numberOfClasses;
    }
    
    
}
