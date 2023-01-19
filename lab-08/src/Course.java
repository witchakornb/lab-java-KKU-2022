//653380024-8 นายวิชชากร บุญประคม sec 2
import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> student;

    public Course(){
        courseId = "";
        courseName = "";
        this.student = new ArrayList<Student>();
    }
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.student = new ArrayList<Student>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }
    public Student getStudent(int x){
        return student.get(x);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
