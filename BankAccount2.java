class BankAccount2
{
    private double balance;

    BankAccount2(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount )
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposited : " + amount);
            System.out.println("new Balance is : "+ balance);
        }
        else
        {
            System.out.println("Please provide amount greater than 0");
        }
    }

    public void withdraw(double amount )
    {
        if(amount>0 && amount <=balance)
        {
            balance -= amount;
            System.out.println("Withdraw amount : " + amount);
            System.out.println("Reamining Balance is : "+ balance);
        }
        else
        {
            System.out.println("Please provide amount greater than 0");
        }
    }
}