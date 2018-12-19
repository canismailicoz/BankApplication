/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

/**
 *
 
 */
public interface  InterBankPaymentMediator {
    
     public  void transferring(Bank SendingBank,Bank ReceivingBank,double sendingMoney);
   public  void payment(Bank sendingBank,Bank receivingBank,double sendingMoney);
    public  void addBank(Bank bank);
   
}
