/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 
 */
public class AccountMediatorImpl implements AccountMediator {
    private List<Account> accounts;
     public AccountMediatorImpl() {
        this.accounts = new ArrayList<>();
    }
     @Override
      public void transferring(Account SendingAccount,Account ReceivingAccount,double sendingMoney)
    {
          if (sendingMoney>SendingAccount.balance) {
            
            System.out.println("Insufficient balance !");
            }
           else if(sendingMoney<=SendingAccount.balance)
            {
                 SendingAccount.balance-=sendingMoney;
                    for(Account c:this.accounts)
                     {
                         if(c==ReceivingAccount)
                            {
                                ReceivingAccount.receiving(sendingMoney);
                
                            }
                    }
                    System.out.println("Your account balance:"+ SendingAccount.balance);
                     System.out.println("Second account balance:"+ ReceivingAccount.balance);
                 /*   System.out.println("Enter today date DAY/MOUNTH/YEAR");
                    int day,mounth,year;
                     Scanner input = new Scanner(System.in);
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
            System.out.println("The Sending Bank's Balance: "+ SendingAccount.balance);
            System.out.println("Money transfer was successfully realized. "+"Amount of money sent: " + sendingMoney);  
                System.out.println(ReceivingAccount.balance);
                String type="Transferring";
        String description="Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
      //  SendingAccount.operation.add(operation);
       SendingAccount.historyOfOperation.addOperation(operation);
        ////////
         String type1="Receiving";
        String description1="Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
       // ReceivingAccount.operation.add(operation);
        ReceivingAccount.historyOfOperation.addOperation(operation1);*/
            }
    }

    @Override
    public void addAccount(Account account) {
          this.accounts.add(account);
    }
    
}
