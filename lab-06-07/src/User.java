// 653380024-8 sec2 วิชชากร บุญประคม
public class User{
    private String ID;
    private String name;

    public User(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public User() {
        ID = "";
        name = "";
    }

    public User(User james) {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
