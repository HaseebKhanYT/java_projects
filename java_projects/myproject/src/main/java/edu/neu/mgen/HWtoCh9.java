package edu.neu.mgen;

import java.util.ArrayList;

public class HWtoCh9 {
    public static void main(String[] args) {
        EngClass engineeringClass = new EngClass();

        // Adding students
        engineeringClass.addStudent(new Student(1, "Haseeb", "Khan"));
        engineeringClass.addStudent(new Student(2, "Sergey", "Aityan"));
        engineeringClass.addStudent(new Student(3, "Shah Rukh", "Khan"));

        // Displaying initial list
        engineeringClass.displayStudents();

        // Deleting a student
        engineeringClass.deleteStudent(2);

        // Displaying updated list
        engineeringClass.displayStudents();

        // Adding a new student
        engineeringClass.addStudent(new Student(4, "Bill", "Gates"));

        // Displaying final list
        engineeringClass.displayStudents();
    }

}

class Student {
    private int studentID;
    private String firstName;
    private String lastName;

    public Student(int studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Student ID: " + studentID + ", Name: " + firstName + " " + lastName;
    }
}

class EngClass {

    private ArrayList<Student> students;

    public EngClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                break;
            }
        }
    }

    public void displayStudents() {
        System.out.println("List of Students in Engineering Class:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("End of the list\n");
    }
}