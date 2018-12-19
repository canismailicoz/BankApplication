/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Scanner;

/**
 *
 * 
 */
public class DebitAccount {
  private double debit;
 private double balance;
   /* public DebitAccount(double debit) {
        this.debit = debit;
    }*/
   // private double balance;
    private DebitAccountInterface debitaccountinterface;
    private DebitAccountInterface seconddebitaccountinterface;

    public DebitAccount() {
    }

    
  
   public DebitAccount(double debit, double balance) {
        this.debit = debit;
        this.balance = balance;
    }
    public void payment(Account account,double  paymentMoney)
    {
        double temproal,accountbalance;
       debitaccountinterface=new DebitAccountApply();
       seconddebitaccountinterface=new DebitAccountReceiving(debitaccountinterface);
       temproal=seconddebitaccountinterface.paymentDebit(account, paymentMoney);
     accountbalance=account.getBalance()-1;
     account.setBalance(accountbalance+temproal);
    }
    public void otherOfPayment(DebitAccount debits,Account account)
    {
         double paymentMoney;
         double money,money2;
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the money you want to pay");
       paymentMoney=input.nextDouble();
        if(debits.debit>=paymentMoney)
        {
           debits.debit-=paymentMoney;
           money=account.getBalance();
           money2=money-paymentMoney;
           account.setBalance(money2);
          
        }
        else
        {
            System.out.println("You have entered more money.");
        }
    }
    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {// bunu account içinde 0 eşitle
        this.balance = balance;
    }
    public void addingDebt(double money,Account account)// değiştiriyoruzz
    {
        account.debitAccount.debit+=money;
       // balance+=money;
    }

  
}
