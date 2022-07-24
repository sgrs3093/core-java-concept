package oops.concept;

import java.util.UUID;

public class Calculation
{
    int no;

    int calculate (int i)
    {
        System.out.println("Entered into calculate method ::::");
        return i * 100;
    }

    UUID fact ()
    {
        System.out.println("Entered into fact method :::");
        return UUID.randomUUID();
    }
}
