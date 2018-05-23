package XI_XII_XIII;

public class BankAccount
{
    //Fields that represent the values that a Bank account is holding on to
    String name;
    double balance;
    //Opgave XI
    double transactionFee;
    // Method that deposits a specific amount of money to the existing account balance.

    public BankAccount(String name)
    {
        this.name = name;
    }

    //method that withdraws a specific amount of money, from the existing account balance.
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw (double amount)
    {
        transactionFee = 5.0;
        double postBalance = balance - amount - transactionFee;

        if (postBalance > 0 )
        {
            balance = postBalance;
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }
    // A method that checks if the balance of a given account can actually withdraw the money from the account, and then
    //proceeds to move the money from one account to the other.

    public void transfer (BankAccount targetAccount, double amount)
    {
        transactionFee = 5;
        double postBalance = this.balance - amount - transactionFee;
        if(postBalance > 0 )
            this.balance = postBalance;
        targetAccount.deposit(amount);
    }
    //XII
    //Method that overrides the defualt print pattern of System.out.println and puts in the given things instead.
    @Override
    public String toString()
    {
        return name + " " + balance + " $";
    }
}
