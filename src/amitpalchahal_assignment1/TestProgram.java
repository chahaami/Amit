/*
 * Made By Amitpal Chahal
 * Assignment 1
 * On June 1,2019
 */
package amitpalchahal_assignment1;

import java.util.Scanner;

/**
 *
 * @author chahalamit
 */
public class TestProgram {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id : ");
        String id=sc.next();
        System.out.println("Enter balance : ");
        double balance=sc.nextDouble();
        System.out.println("Enter overdraft amount : ");
        double overdraft=sc.nextDouble();
        int opt=0;//opy --> option
        SavingAccount user=new SavingAccount(id,balance,overdraft);//object user created
        while(opt != 3){// so that loop closes when user enters 3
            
            System.out.println("1. Deposit Amount to Savings Account\n2. "
                    + "Withdraw Amount from Savings Account\n3. Exit");// action to be taken
        
        opt=sc.nextInt();
        
        
        if (opt==1){
            System.out.println("Please enter an amount to deposit to your "
                    + "savings account: ");
            double amount=sc.nextDouble();
          balance=user.deposit(balance,amount);
          user.setBalance(balance);
          System.out.println("The amount of $"+amount+" Successfully deposited "
                  + "in your saving account. \n Your current balance after"
                  + " deposit is $"+balance);
           
           
          
           
           
        }
            else if (opt ==2){
                    System.out.println("Please enter an amount to withdraw"
                            + " from your savings account:");
            double amount=sc.nextDouble();
            balance=user.withdraw(balance,amount);
   
            user.setBalance(balance);
           
            
            
}
            else if (opt==3){
                System.out.println("Thank You!");
            }
            else{
                System.out.println("Sorry! Invalid Entery \nPlease select One"
                        + " of the following options:");
        
    
    
    }
    
}//ends while loop
}//ends main method
}// ends main class


