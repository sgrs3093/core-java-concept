package oops.concept.constructor;

public class Student1
{
    int id;
    String name;
    int age;

    // overloaded constructor

    Student1 (int i,
              String n)
    {
        System.out.println("from 2 argument constructor ");
        id = i;
        name = n;
    }

    Student1 (int i,
              String n,
              int a)
    {
        System.out.println("from 3 argument constructor ");
        id = i;
        name = n;
        age = a;
    }

    void display ()
    {
        System.out.println(id + " " + name + "  " + age);
    }

    public static void main (String[] args)
    {
        Student1 s1 = new Student1(1,
                                   "a");

        Student1 s2 = new Student1(2,
                                   "b",
                                   12);

        s1.display();

        s2.display();
    }
}
