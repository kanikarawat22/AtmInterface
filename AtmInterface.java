import java.util.*;

class AtmInterface
{
    private BankAccount2 account;
    private Scanner sc;

    AtmInterface(BankAccount2 account)
    {
        this.account = account;
        this.sc = new Scanner(System.in);
    }
    
    public void display()
    {
        int option = 0;
        while(option !=4)
        {
            System.out.println("Welcome to Atm Banking:");
            System.out.println("1. Check Balance: ");
            System.out.println("2. Deposite :");
            System.out.println("3. Withdraw: ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            
            switch(option)
            {
                case 1 :
                    checkBalance();
                    break;
                case 2 :
                    deposit();
                    break;
                case 3 :
                    withdraw();
                    break;
                case 4 :
                    System.out.println("Thanking you for choosing Atm Banking .");
                    break;
                default:
                    System.out.println("Please make correct choices : ");
            }

        }
    }    
    
    public void deposit()
    {
        System.out.print("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }
    public void withdraw()
    {
        System.out.print("Enter the amount you want ot withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
    public void checkBalance()
    {
        System.out.print("Account Balance is " + account.getBalance());
    }

    public void closeScanner()
    {
        sc.close();
    }

    public static void main(String[] args)
    {
        BankAccount2 bk2 = new BankAccount2(2000);
        AtmInterface ak2 = new AtmInterface(bk2);
        ak2.display();
        ak2.closeScanner();

    }
}

