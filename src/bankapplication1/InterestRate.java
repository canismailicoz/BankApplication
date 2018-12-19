/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *

 */
public class InterestRate {
    private double balance;
    private double debt;
    private Date firstHistoryDate;
     private Date lastHistoryDate;
     private double interestRate;

    public InterestRate() {
    }

 /*   public InterestRate(double balance, double debt, double interestRate) {
        this.balance = balance;
        this.debt = debt;
        this.interestRate = interestRate;
    }*/

    public InterestRate(double balance, double debt, Date firstHistoryDate, Date lastHistoryDate) {
        this.balance = balance;
        this.debt = debt;
        this.firstHistoryDate = firstHistoryDate;
        this.lastHistoryDate = lastHistoryDate;
    }

    public InterestRate(double balance, double debt, Date firstHistoryDate, Date lastHistoryDate, double interestRate) {
        this.balance = balance;
        this.debt = debt;
        this.firstHistoryDate = firstHistoryDate;
        this.lastHistoryDate = lastHistoryDate;
        this.interestRate = interestRate;
    }



    
    
     public long calculationBetweenTwoDates(){
         
         long difference;
        // difference= TimeUnit.MILLISECONDS.toDays (lastHistoryDate.getTime()-firstHistoryDate.getTime());
         difference=(lastHistoryDate.getTime()/(1000*60*60*24))-(firstHistoryDate.getTime()/(1000*60*60*24));
        // difference= difference/86400000;
        
         return difference;

        
        }
      public double calculationInterestRate()
    {
        
        double rate;
        rate=(((balance/1000)+calculationBetweenTwoDates()/100)-(debt/10000))/100;
        interestRate=rate;
        return rate;
        
        
    }
      public void decreasingInterestRate()
      {
          interestRate-=0.005;
          
      }
      public double changeOfInterestRate(double balance, double debt, Date firstHistoryDate, Date lastHistoryDate)
      {
          this.balance = balance;
        this.debt = debt;
        this.firstHistoryDate = firstHistoryDate;
        this.lastHistoryDate = lastHistoryDate;
          return calculationInterestRate();
      }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
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
     
    
}
