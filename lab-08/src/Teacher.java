//653380024-8 นายวิชชากร บุญประคม sec 2
public class Teacher extends Person {
    private String teacher_ID;

    public Teacher() {
        super();
        teacher_ID = "";
    }

    public Teacher(String personal_ID, String name, String teacher_ID) {
        super(personal_ID, name);
        this.teacher_ID = teacher_ID;
    }

    public String getTeacher_ID() {
        return teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        this.teacher_ID = teacher_ID;
    }
}
