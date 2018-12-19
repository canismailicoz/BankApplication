
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import bankapplication1.HistoryOfOperation;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/**
 *
 * 
 */
public abstract class Account {


  
    protected int id;
    protected String owner;
    protected Date date_of_opennig;
    protected double balance;
 
  //  protected LinkedList<Operation> operation;
     protected HistoryOfOperation historyOfOperation;
    protected DebitAccount debitAccount;
    protected AccountMediatorImpl mediator;
    protected  InterestRate interestRate;
    protected Deposit deposit;
    protected Loans loans;
    protected Reporting reporting;
    public Account(int id, String owner, Date date_of_opennig, double balance,AccountMediatorImpl mediator) {
        this.id = id;
        this.owner = owner;
        this.date_of_opennig = date_of_opennig;
        this.balance = balance;
          this.mediator=mediator;
         debitAccount= new DebitAccount();
          historyOfOperation=new HistoryOfOperation();
          interestRate=new InterestRate();
          deposit=new Deposit();
          loans=new Loans();
         reporting=new Reporting();
          
         
    }

    // protected Deposit deposit;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public DebitAccount getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(DebitAccount debitAccount) {
        this.debitAccount = debitAccount;
    }

 /*  public Account(int id, String owner, Date date_of_opennig, double balance, LinkedList<Operation> operation, HistoryOfOperation historyOfOperation, DebitAccount debitAccount, AccountMediatorImpl mediator) {
        this.id = id;
        this.owner = owner;
        this.date_of_opennig = date_of_opennig;
        this.balance = balance;
        this.operation = operation;
        this.historyOfOperation = historyOfOperation;
        this.debitAccount = debitAccount;
        this.mediator = mediator;
    }*/


   /* public Account(double balance, DebitAccount debitAccount) {
        this.balance = balance;
        this.debitAccount = debitAccount;
    }*/
    
    /**
     *
     * @param message
     */
    public abstract void operationMessage(Account account);
    public abstract void notify(Operation operation);
    public abstract void receiving(double reMoney);
    public abstract void transferringAccount(Account ReceivingAccount, double sendingMoney);
    public abstract void payment(DebitAccount debitAccount);
    public abstract void makeDeposit();
    public abstract void withDrawal();
    public abstract  void makeLoan();
    public abstract  void transactionsOfDebitAccount();
    public abstract void accountOperation(Account secondAccount,int choose);
   public abstract void saveOperation(Account firstAccount,Account secondAccount,double sendingMoney,String type);
   public abstract void saveOperation1(Account firstAccount,double money,String type,Date nowDate);
 public abstract void show();
    
}
