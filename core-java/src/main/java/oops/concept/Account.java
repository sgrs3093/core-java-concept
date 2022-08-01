package oops.concept;

public class Account
{
    //fields
    int account_no;
    String account_name;
    float amount;

    void insert (int a,
                 String n,
                 float amnt)
    {
        account_no = a;
        account_name = n;
        amount = amnt;
    }

    void depositAmount (float amnt)
    {
        amount = amount + amnt;
        System.out.println(amnt + " :: amount deposited ..");
    }

    void withdraw (float amt)
    {
        if (amt > amount) {
            System.out.println("passed amount is grater then existing amount in the account..Please pass less amount ");
        }
        else {
            amount = amount - amt;
            System.out.println(amt + " :: amount withdraw...");
        }

    }

    void display ()
    {
        System.out.println("account name :: " + account_name + " account amount :: " + amount
                                           + " account number :: " + account_no);

    }
}
