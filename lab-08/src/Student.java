//653380024-8 นายวิชชากร บุญประคม sec 2
public class Student extends Person {
    private String student_ID;

    public Student() {
        super();
        this.student_ID = "";
    }
    public Student(String personal_ID, String name, String student_ID) {
        super(personal_ID, name);
        this.student_ID = student_ID;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }
}
