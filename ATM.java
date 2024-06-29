import java.util.*;

public class ATM extends Account
{

    Scanner sc = new Scanner(System.in);

    public ATM(double initialBalance)
    {
        super(initialBalance);
    }

    public void displayMenu()
    {
        int choice;
        System.out.println("             WELCOME TO INDIAN BANK             ");
        System.out.println("................................................");
        System.out.println(".                                              .");
        System.out.println(".                 1.Check Balance              .");
        System.out.println(".                 2.Withdrawal                 .");
        System.out.println(".                 3.Deposit                    .");
        System.out.println(".                 4.Exit                       .");
        System.out.println(".                                              .");
        System.out.println("................................................");
        
        do
        {
            System.out.print("\nEnter your choice: ");
            try
            {
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        withdrawal();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid number.");
                } 
            } catch(Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); 
                choice = 0;
             }  
        } while(choice != 4);
    }
    
     public void checkBalance()
    {
        System.out.println("\nBalance Amount: " + balance);
    }
    public void withdrawal()
    {
        System.out.print("\nEnter the amount to withdraw: ");
        double amount = sc.nextDouble();
        super.withdrawal(amount);
    }
    public void deposit()
    {
        System.out.print("\nEnter the amount to deposit: ");
        double amount = sc.nextDouble();
        super.deposit(amount);
    }
    public void exit()
    {
        System.out.println("Thankyou for using the ATM.......!");
    }
    
    public static void main(String[] args)
    {
        ATM atm = new ATM(20000.00);
        atm.displayMenu();
    }
} 

    

