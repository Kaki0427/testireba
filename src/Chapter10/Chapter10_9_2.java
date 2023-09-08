package Chapter10;

public class Chapter10_9_2 {
    public static void main(String[] args) {
        Course course = new Course("Programming 101");

        // Add three students
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        // Display the students in the course
        System.out.println("Students in the course:");
        String[] students = course.getStudents();
        for (String student : students) {
            System.out.println(student);
        }

        // Remove one student
        course.dropStudent("Bob");

        // Display the students again
        System.out.println("\nStudents in the course after dropping one:");
        students = course.getStudents();
        for (String student : students) {
            System.out.println(student);
        }

        // Clear the course
        course.clear();
        System.out.println("\nNumber of students after clearing the course: " + course.getNumberOfStudents());
    }
}

