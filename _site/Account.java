
/**
 * This program is a primitive tool for very basic bank account management applications.
 *
 * @author Robin Wuergler
 * @version 1.0
 */
public class Account
{
    private int balance;
    private int interestRate;
    private String owner;
    
    /**
     * Creates a new account. 
     * Only the name of the owner is required, the
     * interest rate will be set to the default value.
     * @param owner Name of the owner
     */
    public Account(String owner)
    {
    balance = 0;
    interestRate = 2;
    this.owner = owner;
    }
     /**
     * Creates a new account, along with the name of the
     * owner, as well as the interest rate.
     * @param owner Name of the owner
     * @ interestRate Interest rate (in %)
     */
    public Account(String owner, int interestRate)
    {
    balance = 0;
    this.interestRate = interestRate;
    this.owner = owner;
    }

    
    /**
     * Sets a new user-defined interest rate for the account
     * @param newRate New interest rate (in %)
     */
    public void setInterestRate(int newRate)
    {
    interestRate = newRate;
    System.out.println("Interest has been changed to: " + interestRate);
    }
    
    /**
     * Returns the interest rate (in %) applied to the current account
     */
    public int getInterestRate()
    {
    return interestRate;
    }
    /**
     * Adds money to the account.
     * @param addFunds Amount of money you want to add to the account.
     */
    public void addFunds(int addFunds)
    {
    balance = balance + addFunds;
    System.out.println("You have added " + addFunds + " to your account.");
    }
    
    /**
     * Withdraws money from the account.
     * @param withdrawFunds Amount of money you want to withdraw from the account.
     */
    public void withdrawFunds(int withdrawFunds)
    {
    balance = balance - withdrawFunds;
    System.out.println("You have withdrawed " + withdrawFunds + " from your account.");
    }
    /**
     * Returns the calculated interest (in %) based on the balance and the interest rate.
     */
    public int getInterest()
    {
        return ((balance*interestRate)/100);
    }
    /**
     * Returns a formatted overview of the account.
     * Information that will be displayed:
     * Account owner
     * Current balance on account
     * Current interest rate
     */
    public void getStatus()
    {
    System.out.println("Account details:");
    System.out.println("Account owner: " + owner);
    System.out.println("Current balance: " + balance);
    System.out.println("Interest Rate (in %): " + interestRate);
    }
}
