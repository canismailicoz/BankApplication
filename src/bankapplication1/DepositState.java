/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;

/**
 *
 * 
 */

public class DepositState {

    public DepositState() {
        
    }
    

   /* public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }*/



  
    
     public long  calculationBetweenTwoDates(Date firstDate,Date secondDate){
         
         long difference;
        /* difference=secondDate.getTime()-firstDate.getTime();
         difference= difference/86400000;*/
         difference=(secondDate.getTime()/(1000*60*60*24))-(firstDate.getTime()/(1000*60*60*24));
         return difference;

        
        }
    public boolean doAction(Date nowDate,Deposit deposit)
    {
       boolean state = false;
        if(this.calculationBetweenTwoDates(deposit.getLastHistoryDate(), nowDate)>=0)
        {
            System.out.println("You receive your deposit on time.");
            state=true;
        }
        else if(this.calculationBetweenTwoDates(deposit.getLastHistoryDate(), nowDate)<0)
        {
            System.out.println("You receive your deposit pre-time because your interest rate will be counted again.");
            state= false;
        }
        return state;
    }

   

  

    
            
    
    
            
    
}
