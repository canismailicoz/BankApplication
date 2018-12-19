/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

/**
 *
 *
 */
public class DebitAccountApply implements DebitAccountInterface{

    @Override
    public double paymentDebit(Account account, double paymentMoney) {
       double provisionalDebt;
       double a=0;
       provisionalDebt=account.debitAccount.getDebit()-paymentMoney;
       if(provisionalDebt<=0)
       {
            account.debitAccount.setDebit(0);
            a=0;
       }
       else if(provisionalDebt>0)
       {
            account.debitAccount.setDebit(provisionalDebt);
             a=(-1*provisionalDebt);
          
       }
      
         return a;
      
    }
    
}
