//653380024-8 นายวิชชากร บุญประคม sec 2
public class Person {
    private String personal_ID;
    protected String name;

    public Person(){
        personal_ID = "";
        name = "";
    }
    public Person(String personal_ID, String name) {
        this.personal_ID = personal_ID;
        this.name = name;
    }

    public String getPersonal_ID() {
        return personal_ID;
    }

    public void setPersonal_ID(String personal_ID) {
        this.personal_ID = personal_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
