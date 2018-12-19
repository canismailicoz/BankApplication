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
public class DebitAccountReceiving extends DebitAccountDecarotor
{

    public DebitAccountReceiving(DebitAccountInterface debitaccountinterface) {
        super(debitaccountinterface);
    }

    @Override
    public double paymentDebit(Account account, double paymentMoney) {
       double a,b,c,d;
       d=1;
        a=debitaccountinterface.paymentDebit(account, paymentMoney);
        if(a>0)
        {
            account.debitAccount.setDebit(0);
        b=againReceving(account, a);
        }
        
        return d;
    }
     public double againReceving(Account account, double paymentMoney)
     {
         account.receiving(paymentMoney);
         return paymentMoney;
     }
    
    
}
