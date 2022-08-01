package oops.concept.constructor;

public class Student
{

    //
    int studentId;
    String studentName;

    //parameterized constructor
    Student (int id,
             String name)
    {

        studentId = id;
        studentName = name;

    }

    void displayStudentInfo ()
    {
        System.out.println("student id " + studentId + " and student name " + studentName);
    }

    public static void main (String[] args)
    {
        Student s = new Student(111,
                                "abc");

        Student s1 = new Student(112,
                                 "bcd");

        s.displayStudentInfo();

        s1.displayStudentInfo();

    }
}
