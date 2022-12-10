// 653380024-8 วิชชากร บุญประคม sec 2
public class Person {
    //[Task-03]
    private String name;
    private int ID;
    private String gender;

    public Person(){
        this.name = "";
        this.ID = 0;
        this.gender = "";
    }
    public Person(String name,int ID,String gender){
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }
    public String getNane(){
        return this.name;
    }
    public int getID(){
        return this.ID;
    }
    public String getGender(){
        return this.gender;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

}
