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

 */
public class InterBankPayment implements InterBankPaymentMediator{
  
private List<Bank> banks;   

    public InterBankPayment() {
        this.banks = new ArrayList<>();
    }
   

   
    @Override
      public void transferring(Bank SendingBank,Bank ReceivingBank,double sendingMoney)
    {
          if (sendingMoney>SendingBank.bankBalance) {
            
            System.out.println("Insufficient balance !");
            }
           else if(sendingMoney<=SendingBank.bankBalance)
            {
                 SendingBank.bankBalance-=sendingMoney;
                    for(Bank b:this.banks)
                     {
                         if(b==ReceivingBank)
                            {
                                ReceivingBank.receiving(sendingMoney);
                
                            }
                    }
                    System.out.println("Sending bank balance="+SendingBank.bankBalance);
                  System.out.println("Receiving bank balance="+ReceivingBank.bankBalance);
                     /* System.out.println("Enter today date DAY/MOUNTH/YEAR");
                    int day,mounth,year;
                     Scanner input = new Scanner(System.in);
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
            System.out.println("The Sending Bank's Balance: "+ SendingBank.bankBalance);
            System.out.println("Money transfer was successfully realized. "+"Amount of money sent: " + sendingMoney);  
                System.out.println(ReceivingBank.bankBalance);
                  String type="Transferring";
        String description="Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
        SendingBank.operation.add(operation);
        SendingBank.historyOfOperation.addOperation(operation);
        ////////
         String type1="Receiving";
        String description1="Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
        ReceivingBank.operation.add(operation1);
         ReceivingBank.historyOfOperation.addOperation(operation1);*/
               
            }
    }
      @Override
      public void payment(Bank sendingBank,Bank receivingBank,double sendingMoney)
      {
          transferring(sendingBank,receivingBank, sendingMoney);
      }
      @Override
      public void addBank(Bank bank)
      {
          this.banks.add(bank);
      }
   

    
}
