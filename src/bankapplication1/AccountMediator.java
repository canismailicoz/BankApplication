/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

/**
 *
 * z
 */
public interface AccountMediator {
     public void transferring(Account SendingAccount,Account ReceivingAccount,double sendingMoney);
     public void addAccount(Account account);
}
