//653380024-8 นายวิชชากร บุญประคม sec 2
public class Main {
    public static void main(String[] args) {
        Student std01 = new Student("P_001","james","S_001");
        Student std02 = new Student("P_002","shiro","S_002");
        Student std03 = new Student("P_003","JK","S_003");
        Student std04 = new Student("P_004","Zizi","S_004");
        Teacher T01 = new Teacher("P_005","Kam","T_001");
        Teacher T02 = new Teacher("P_006","Mena","T_002");
        Course cp351003 = new Course("CP351003","OBJECT–ORIENTED PROGRAMMING");
        Course cp351004 = new Course("CP351004","Computer Architecture");
        cp351003.addStudent(std01);
        cp351003.addStudent(std02);
        cp351003.addStudent(std03);
        cp351003.addStudent(std04);
        cp351003.addTeacher(T01);
        cp351004.addTeacher(T02);
        cp351004.addStudent(std01);
        cp351004.addStudent(std02);
        cp351004.addStudent(std03);
        cp351004.addStudent(std04);
        System.out.println("Course Name = " + cp351003.getCourseName());
        System.out.println("Teacher Name = " + cp351003.getTeacher().getName());
        for (Student std: cp351003.getStudent()) {
            System.out.println("Student Name = " + std.getName());
        }
        Student std05 = new Student("p_007","JJ","S_005");
        cp351004.addStudent(std05);
        System.out.println();
        System.out.println("Course Name = " + cp351004.getCourseName());
        System.out.println("Teacher Name = " + cp351003.getTeacher().getName());
        for (Student std: cp351004.getStudent()) {
            System.out.println("Name = " + std.getName());
        }

    }
}