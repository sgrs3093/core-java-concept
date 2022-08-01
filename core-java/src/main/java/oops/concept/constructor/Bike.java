package oops.concept.constructor;

public class Bike
{
    //filed ,datamember
    int bikeNo;
    String bikeName;

    //default constructor
    Bike ()
    {
        System.out.println("Hi from bike constructor ");
    }

    void display ()
    {
        System.out.println("bike number : " + bikeNo + " and bike name : " + bikeName);
    }

    public static void main (String[] args)
    {
        Bike b = new Bike();
        b.display();
    }
}
