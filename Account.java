
public class Account
{
    protected double balance;
    
    public Account(double initialBalance)
    {
        balance = initialBalance;
    }
    
	public void withdrawal(double amount)
	{
	    if(amount > 0 && amount <=  balance)
	    {
	        balance -= amount;
		    System.out.println("Withdrawal successful. Remaining balance: " + balance);
	        
	    }
		else if(amount > balance)
		{
		    System.out.println("Insufficient Balance..........Enter valid amount!");
		}
	    else
	    {
	        System.out.println("Sorry, Withdrawal Failed..........Please try again!");
		}
	}
		
	public void deposit(double amount)
	{
	    if(amount > 0)
	    {
	        balance += amount;
	        System.out.println("Deposit successful. New Balance after deposited the amount: " + balance);
	    }
	    else
	    {
	        System.out.println("Sorry, Deposit failed..........Please try again with valid amount!");
	    }
	}
}
