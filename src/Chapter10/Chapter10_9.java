package Chapter10;

import java.util.Arrays;

public class Chapter10_9 {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Chapter10_9(String courseName) {
        this.courseName = courseName;
        this.students = new String[1]; // Start with an array of size 1
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        // Check if the array is full and expand it if necessary
        if (numberOfStudents == students.length) {
            students = Arrays.copyOf(students, students.length * 2);
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int index = indexOfStudent(student);
        if (index != -1) {
            // Shift all elements to the left to remove the student
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    public int indexOfStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (student.equals(students[i])) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public void clear() {
        // Simply create a new array with the original size
        students = new String[1];
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        return Arrays.copyOf(students, numberOfStudents);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
