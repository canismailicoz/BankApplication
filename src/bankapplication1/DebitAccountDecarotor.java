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
abstract class DebitAccountDecarotor implements DebitAccountInterface{

    protected DebitAccountInterface debitaccountinterface;

    public DebitAccountDecarotor(DebitAccountInterface debitaccountinterface) {
        this.debitaccountinterface = debitaccountinterface;
    }
     public double payment(Account account, double paymentMoney)
     {
         return debitaccountinterface.paymentDebit(account, paymentMoney);
         
     }
    

}
    

