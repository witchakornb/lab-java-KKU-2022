// 653380024-8 วิชชากร บุญประคม sec 2
public class Employee {
    private String ID;
    private String name;
    private double salary;
    private double bonus;

    public Employee(){
        this.ID = "";
        this.name = "";
        this.salary = 0.00;
        this.setBonus();
    }
    public Employee(String ID,String name,double salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.setBonus();
    }
    public void setId(String ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
        this.setBonus();

    }
    private void setBonus(){
        if (this.salary >= 100000){
            this.bonus = this.salary*10/100;
        } else if (this.salary >= 50000) {
            this.bonus = this.salary*7/100;
        } else{
            this.bonus = this.salary*5/100;
        }
    }
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public double getBonus(){
        return this.bonus;
    }
}
