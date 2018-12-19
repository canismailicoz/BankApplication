/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *

 */
public class Deposit {
    private double depositMoney;
     private Date firstHistoryDate;
     private Date lastHistoryDate;
     private DepositState depositState;
private double firstDepositMoney;
    public Deposit(double depositMoney, Date firstHistoryDate, Date lastHistoryDate) {
        this.depositMoney = depositMoney;
       firstDepositMoney=0;
        this.lastHistoryDate = lastHistoryDate;
      //  this.depositState = depositState;
      depositState=new DepositState();
      //deposit satate tanımlayı unutma
      
    }

    public Deposit() {
        
    }

  
    

    public DepositState getDepositState() {
        return depositState;
    }

    public void setDepositState(DepositState depositState) {
        this.depositState = depositState;
    }

    

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Date getFirstHistoryDate() {
        return firstHistoryDate;
    }

    public void setFirstHistoryDate(Date firstHistoryDate) {
        this.firstHistoryDate = firstHistoryDate;
    }

    public Date getLastHistoryDate() {
        return lastHistoryDate;
    }

    public void setLastHistoryDate(Date lastHistoryDate) {
        this.lastHistoryDate = lastHistoryDate;
    }
    public boolean doAction(Date nowDate)
    {
        depositState=new DepositState();
       return (depositState.doAction(nowDate,this));
    }
    public void closeDepositAccount()
    {
        depositMoney=0;
    }
    
    public void payment(double receivingDeposit)
    {
        depositMoney=receivingDeposit;
        
    }
    public double calculateDeposit(double receivingDeposit,double balance, double debt, Date firstHistoryDate, Date lastHistoryDate)
    {
        double calculatedDeposit;
        double sumDeposit;
        InterestRate depositInterestRate=new InterestRate(balance, debt, firstHistoryDate, lastHistoryDate);
        calculatedDeposit=(receivingDeposit/100)*(depositInterestRate.calculationInterestRate()/365)*(depositInterestRate.calculationBetweenTwoDates());
        sumDeposit=receivingDeposit+calculatedDeposit;
        return sumDeposit;
    }
    public void makeDeposit(Account account,double receivingMoney,Date fDate,Date lDate)
    {
        firstHistoryDate=fDate;
        lastHistoryDate=lDate;
        if(receivingMoney<=account.getBalance())
        {
        firstDepositMoney=receivingMoney;
        double lastAccountMoney;
        double lastDepositMoney;
       // this.payment(receivingMoney);
        lastAccountMoney=account.getBalance()-receivingMoney;
        account.setBalance(lastAccountMoney);////////////////////////////////////////account.getDebitAccount().getDebit()
       lastDepositMoney= this.calculateDeposit(receivingMoney, account.getBalance(), 100, firstHistoryDate, lastHistoryDate);
       depositMoney=lastDepositMoney;
            
// this.setDepositMoney(lastDepositMoney);
        String type="Deposit";
        String description="Deposit: "+ lastAccountMoney+" ";
        Operation operation=new Operation(type, lDate, description);
      account.historyOfOperation.addOperation(operation);
        // account.operation.add(operation);
        }
        else
        {
            System.out.println("insufficient balance");
                    
        }
    }
    public void withDrawal(Account account)
    {
        Scanner input = new Scanner(System.in);
        double lastMoney = 0;
        int day,mounth,year;
        System.out.println("Enter today date DAY/MOUNTH/YEAR");
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
       
        if(this.doAction(nowDate)==true)
        {
           lastMoney=depositMoney;
         
        }
        else if(this.doAction(nowDate)==false)
        {
            lastMoney=firstDepositMoney;
            account.interestRate.decreasingInterestRate();
            
        }
          String type="DepositWithDrawal";
       /* String description="Deposit WithDrawall: "+ lastMoney+" ";
        Operation operation=new Operation(type, nowDate, description);*/
       // account.operation.add(operation);
          /* account.historyOfOperation.addOperation(operation);*/
         
         depositMoney=0;
        
        account.receiving(lastMoney);
         account.saveOperation1(account, lastMoney, type, nowDate);
    }
   
  
    
}
