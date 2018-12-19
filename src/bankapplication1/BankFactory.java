/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import bankapplication1.Bank;
import bankapplication1.abstractFactory;
/**
 *
 * 
 */
public class BankFactory implements abstractFactory{
    private String bankName;
    private double bankBalance;
private InterBankPayment mediator;
    public BankFactory(String bankName, double bankBalance,InterBankPayment mediator) {
        this.bankName = bankName;
        this.bankBalance = bankBalance;
        this.mediator=mediator;
    }

    @Override
    public Bank createBank() {
       return new BankImpl(bankName, bankBalance,mediator);
       }
    

}
   
