package Chapter13;

import java.util.ArrayList;
import java.util.List;

public class Course implements Cloneable {
    private String courseName;
    private List<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public List<String> getStudents() {
        return students;
    }

    @Override
    public Object clone() {
        try {
            Course clonedCourse = (Course) super.clone();
            clonedCourse.students = new ArrayList<>(this.students);
            return clonedCourse;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course("Course 1");
        course1.addStudent("Alice");
        course1.addStudent("Bob");

        Course course2 = (Course) course1.clone();

        course1.addStudent("Charlie");

        System.out.println("Students in Course 1: " + course1.getStudents());
        System.out.println("Students in Course 2 (cloned): " + course2.getStudents());
    }
}

