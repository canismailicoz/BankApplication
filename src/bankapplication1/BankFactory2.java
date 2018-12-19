/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import bankapplication1.Bank;
/**
 *
 *
 */
public class BankFactory2 {
    public static Bank getBank(abstractFactory factory)
    {
       return factory.createBank();
    }
}
