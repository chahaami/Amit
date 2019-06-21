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
public abstract class Accounts {//superclass Accounts
    private String customerID;
    private double balance;
    double amount, overdraft;
    public Accounts(String customerID, double balance,double overdraft){// arg constructor
      this.customerID = customerID;
      this.balance=balance;// bank balance
      this.overdraft=overdraft;
      
      
    }
    public void setCustomerID(String customerID){
        this.customerID=customerID;// set method ID
    }
    public String getCustomerID(){//get method id
        return customerID;
    }
    public void setBalance(double balance){
        this.balance=balance;//set method balance
    }
    public double getBalance(){//get method balance
        return balance;
    }
    public void setOverdraft(double overdraft){//set method overdraft
        this.overdraft=overdraft;
    }
    public double getOverdraft(){//get method overdraft
        return overdraft;
    }
    
   
    public abstract double deposit(double balance,double amount);//abstract methods
    public abstract double withdraw(double balance,double amount);
   
}
