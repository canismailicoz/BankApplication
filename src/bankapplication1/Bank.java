/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.LinkedList;

/**
 *

 */
public abstract  class Bank {
   protected String bankName;
    protected double bankBalance;
    protected HistoryOfOperation historyOfOperation;
    protected InterBankPayment mediator;

    public Bank(String bankName, double bankBalance, InterBankPayment mediator) {
        this.bankName = bankName;
        this.bankBalance = bankBalance;
        this.mediator = mediator;
        historyOfOperation=new HistoryOfOperation();
    }
    protected LinkedList<Operation> operation;
  

    

    
  

  

    
 
   
 

    public abstract void transferringBank(Bank SendingBank,Bank ReceivingBank, double sendingMoney);
    public abstract void paymentBank(Bank paBank,double paMoney);
    public abstract void receiving(double reMoney);
    public abstract void saveOperation(Bank firstBank,Bank secondBank,double sendingMoney,String type);
    public abstract void bankOperation(Bank secondBank);
    public abstract  void creatingBank();
    public abstract void showBank();
   
    
    
}
