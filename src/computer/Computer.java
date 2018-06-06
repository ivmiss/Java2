
package computer;


public class Computer {
    
    private float processTact;
    private float memory;
    private int hardDrive;
    
    public Computer(float processTact, float memory, int hardDrive){
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    public void setProcessTact(float processTact){
        this.processTact = processTact;
    }
    
    public void setMemory(float memory){
        this.memory = memory;
    }
    
    public void setHardDrive(int hardDrive){
        this.hardDrive = hardDrive;
    }
    
    public float getProcessTact(){
        return this.processTact;
    }
    
    public float getMemory(){
        return this.memory;
    }
    
    public int getHardDrive(){
        return this.hardDrive;
    }
}
