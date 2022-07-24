package oops.concept;

public class TestAccount
{

    public static void main (String[] args)
    {
        Account account = new Account();

        account.insert(10000,
                       "Ankit",
                       1000.0f);

        account.depositAmount(500.00f);//102000

        account.withdraw(500.0f);

        account.display();

    }
}
