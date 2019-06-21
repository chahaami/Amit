/*
 * Made By Amitpal Chahal
 * Assignment 1
 * On June 1,2019
 */
package amitpalchahal_assignment1;

/**
 *
 * @author chahalamit
 */
public class SavingAccount extends Accounts{// subclass Saving Accounts
    
   
    public SavingAccount(String customerID, double balance, double overdraft){// arg constructor
        super(customerID,balance,overdraft);
       
       
    }
    @Override
   public double deposit(double balance,double amount)//Overriding abstract method deposit
	{
            
		balance += amount;// the amount is added in balance
                
               return balance;
               
    }
   

    @Override
	public double withdraw(double balance,double amount)// Overriding abstract method 
	{if(amount < balance){
		balance -= amount;//amount is subtracte from balance
              
              System.out.println("Withdrawl of $"+amount+" successful."
                      + "\nYour current balance is $"+balance+" and"
                      + " Your Overdraft is : "+overdraft);
	}//ends if
        else if (amount > balance && amount<= balance + overdraft)
        {
            overdraft = 10 + overdraft + balance - amount;// remaining overdraft @changed to 10 +
        balance = 0;

        
        System.out.println("Overdraft Used.\nOverdraft funds required"
                + " for the withdrawl.\nAn amount of $"+amount+" successfully "
                + "withdrawn.\nYour current balance is $"+balance+"\nYour "
                + "current Overdraft amount is $"+overdraft);
        }//else if ends
        else if (amount > balance + overdraft){// i.e withdrawl amount higher than ramaining balance and overdraft
            System.out.println("Withdrawl failed! \nInsufficient funds to c"
                    + "omplete the withdrawl\nCurrent balance in your account"
                    + " : $"+balance+"\nCurrent Overdraft amount: $"+overdraft);
        }
        return balance;
        }
        

   
    

    }
   
    
    
    

