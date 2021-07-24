package com.view;

import com.model.Account;
import java.util.Scanner;

class AccountWithoutThreadSafe
{
    Account ac = new Account();
    Scanner sc = new Scanner(System.in);
    void Deposit()
    {
        System.out.print("Enter Amount d : ");
        int total = ac.getBalance()+ sc.nextInt();
        ac.setBalance(total);
    }
    void Withdraw(String name ,int amount)
    {
        int total = ac.getBalance() - amount;
        if(total < 1000)
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Withdraw Request = "+amount);
            System.out.println("Sorry "+name+" your balance is low Minimum 1000₹ is Required");
            System.out.println("Total Amount in Your Account is "+ac.getBalance());
            System.out.println("After Withdraw Your Net Balance is "+total+" So Try After Deposit");
            System.out.println("-------------------------------------------------------------------");
        }
        else
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Withdraw Request = "+amount);
            System.out.println(name+" Your Withdraw is Success");
            System.out.println("Total Amount in Your Account is "+ac.getBalance());
            System.out.println("After Withdraw Your Net Balance is "+total);
            ac.setBalance(total);
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
public class AccountOverdrawDemo extends Thread
{
   static AccountWithoutThreadSafe acc;
   String name;
   int amount;
    public void run()
    {
        acc.Withdraw(name,amount);
    }
    public static void main(String[] args)
    {
        acc = new AccountWithoutThreadSafe();
        AccountOverdrawDemo palash = new AccountOverdrawDemo();
        palash.name="Palash Bajaj";
        palash.amount=500;
        palash.start();
        AccountOverdrawDemo aakash = new AccountOverdrawDemo();
        aakash.name="Aakash Kale";
        aakash.amount=500;
        aakash.start();
    }
}
