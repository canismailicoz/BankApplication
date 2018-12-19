/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 
 */
public class BankImpl extends Bank{

    

    public BankImpl(String bankName, double bankBalance, InterBankPayment mediator) {
        super(bankName, bankBalance, mediator);
    }

   
    
    
   

   /* BankImpl(String bankName, Account account, Loans loan, Deposit deposit, double bankBalance, HistoryOfOperation historyOfOperation, InterBankPaymentMediator mediator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
     public void transferringBank(Bank SendingBank,Bank ReceivingBank,double sendingMoney)
     {String type;
     type="Transferring";
     
   
         mediator.transferring(SendingBank,ReceivingBank,sendingMoney);
        if(SendingBank.bankBalance>=sendingMoney)
        {
         saveOperation(SendingBank, ReceivingBank, sendingMoney, type);
        }
     
     }
     @Override
     public void paymentBank(Bank ReceivingBank,double sendingMoney)
     {String type;
     type="Payment";
        mediator.payment(this, ReceivingBank, sendingMoney);
        if(this.bankBalance>=sendingMoney)
        {
        saveOperation(this, ReceivingBank, sendingMoney, type);
        }
     }
     @Override
    public void receiving(double reMoney)
    {
        this.bankBalance+=reMoney;
        
    }
    @Override
   public void saveOperation(Bank firstBank,Bank secondBank,double sendingMoney,String type)
    {
        System.out.println("Enter today date DAY/MOUNTH/YEAR");
        int day,mounth,year;
        Scanner input = new Scanner(System.in);
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
        System.out.println("The Sending Bank's Balance: "+ this.bankBalance);
        System.out.println("Money transfer was successfully realized. "+"Amount of money sent: " + sendingMoney);  
        System.out.println(secondBank.bankBalance);
        if(type=="Transferring")
        {
         String description="Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
        
      //  firstBank.historyOfOperation=new HistoryOfOperation();
       /* firstBank.operation.add(operation);*/
       firstBank.historyOfOperation.addOperation(operation);
        ////////
          //  System.out.println("bura kadar");
        String type1="Receiving";
        String description1="Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
        secondBank.historyOfOperation.addOperation(operation1);
        
        }
        else if(type=="Payment")
        {
         String description="Payment Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
        firstBank.historyOfOperation.addOperation(operation);
        ////////
        String type1="Receiving";
        String description1="Payment Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
        secondBank.historyOfOperation.addOperation(operation1);
        
        }
        
        
    }
   @Override
    public void bankOperation(Bank secondBank)
    {
        Scanner in = new Scanner(System.in);
        int userChoice;
        double sendingMoney,paymentMoney;
        boolean quit = false;
        do {
            System.out.println("BANKS");
            showBank();
             System.out.println("1. Transferring money");
             System.out.println("2. Payment money");
             System.out.println("3. Reporting");
             System.out.print("Your choice, 0 to quit: ");
             userChoice = in.nextInt();
              switch (userChoice) {

                  case 1:
                      System.out.println("Enter the money you want to send");
                      sendingMoney=in.nextDouble();
                      transferringBank(this,secondBank, sendingMoney);
                      
                      
                        break;

                  case 2:
                      System.out.println("Enter the money you want to payment");
                      paymentMoney=in.nextDouble();
                      paymentBank(secondBank, paymentMoney);

                        break;
                  case 3:
                      System.out.println("REPORTING");
                     int userChoices;
                     boolean quiting=false;
                      do {   
                       System.out.println("1. Transferring");
                        System.out.println("2. Receiving");
                        System.out.println("3. Payment");
                       System.out.print("Your choice, 0 to quit: ");
                         userChoices = in.nextInt(); 
                       switch (userChoices) {
                             case 1:
                                 System.out.println("Transferring");
                                 this.historyOfOperation.show("Transferring");
                                
                                  break;
                              case 2:
                                   System.out.println("Receiving");
                                 this.historyOfOperation.show("Receiving");
                                  break; 
                                  case 3:
                                   System.out.println("Payment");
                                 this.historyOfOperation.show("Payment");
                                  break; 
                              case 0:

                        quit = true;

                        break;
                  default:

                        System.out.println("Wrong choice.");

                        break;
                         }
                         
                          
                      } while (quiting);
                        

                        break;      
                  case 0:

                        quit = true;

                        break;
                  default:

                        System.out.println("Wrong choice.");

                        break;
                }
               System.out.println();
        
    }while (!quit);
     System.out.println("Bye!");
 
    } 

    @Override
    public void creatingBank() {
 

   mediator.addBank(this);
    }

    @Override
    public void showBank() {
        System.out.println("Bank Name="+ bankName);
        System.out.println("Bank Balance="+bankBalance);
    }
   
}
