package oops.concept;

import java.util.UUID;

public class TestCalculation
{

    public static void main (String[] args)
    {
        /*Calculation calculation = new Calculation();
        int no = calculation.calculate(10);
        System.out.println(no);

        UUID uuid = calculation.fact();

        System.out.println(uuid);

        int i = new Calculation().calculate(10);
        System.out.println(i);



        UUID uuid1 = new Calculation().fact();
        System.out.println(uuid1);*/

        int number = new Calculation().no;
        System.out.println(number);

        System.out.println(new Calculation().fact());

    }

}
