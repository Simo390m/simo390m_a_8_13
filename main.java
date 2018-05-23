package XI_XII_XIII;

import XI_XII_XIII.BankAccount;

public class main
{

    public static void main(String[] args)
    {
        // Testing.
        BankAccount yana = new BankAccount("Yana");
        BankAccount ben = new BankAccount("Ben");
        /*
        yana.deposit(100);
        ben.deposit(100);
        System.out.println(yana);
        System.out.println(ben);

        yana.withdraw(10);
        ben.withdraw(100);
        System.out.println(yana);
        System.out.println(ben);*/
        yana.deposit(10000);
        yana.transfer(ben, 100);
        System.out.println(yana);
        System.out.println(ben);


    }
}
