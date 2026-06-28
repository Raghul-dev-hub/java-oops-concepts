Problem Statement:

Develop a Java application to manage student information using classes and objects. The program should store a student's register number, name, department, college name, 
and CGPA. Create appropriate methods to display the student details in a formatted manner.

package Raghul;
import java.util.*
class Student {
    int registerNumber;
    String name;
    String department;
    String college;
    double cgpa;

    void setDetails(int regNo, String studentName, String dept, String collegeName, double studentCgpa) {
        registerNumber = regNo;
        name = studentName;
        department = dept;
        college = collegeName;
        cgpa = studentCgpa;
    }

    void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Register Number : " + registerNumber);
        System.out.println("Student Name    : " + name);
        System.out.println("Department      : " + department);
        System.out.println("College Name    : " + college);
        System.out.println("CGPA            : " + cgpa);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {

        Student student = new Student();

        student.setDetails(59, "Raghul", "ECE", "KSR College", 8.75);

        student.displayDetails();

    }
}
OUTPUT
Student Details
Register Number : 59
Name            : Raghul
Department      : ECE
College         : KSR College
CGPA            : 8.75
