// 653380024-8 วิชชากร บุญประคม sec 2
public class Student {
    //[Task-01]
    private String name;
    private double gps;

    public Student(){
        this.name = "";
        this.gps = 0.00;
    }
    public Student(String name,double gpa){
        this.name = name;
        this.gps = gpa;
    }
    public String getName(){
        return this.name;
    }
    public void setGPA(double gpa){
        this.gps = gpa;
    }
    public double getGPA(){
        return this.gps;
    }

}
