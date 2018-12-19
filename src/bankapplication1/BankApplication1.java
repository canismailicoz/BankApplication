
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
 * 
 */
public class BankApplication1 {

   

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        int userChoice;
          boolean quit = false;
        do {
            System.out.println("WELCOME TO BANK");
            System.out.print("Please select the process you want to do.");
             System.out.println("  ");
            System.out.println("1. Bank Operation");
            System.out.println("2. Account Operation");
            System.out.print("0. to Quit Your choice:  ");
            userChoice = in.nextInt();
             switch (userChoice) {
                 
                  case 1:
                      Write();
                      System.out.println("BANK OPERATIONS");
                       createBank();
                       break;
                  case 2:
                      Write();
                       System.out.println("ACCOUNT OPERATIONS");
                       System.out.println("CREATE ACCOUNT");
                       System.out.println("Create 2 accounts");
                       Account firstAccount=createAccount();
                       Account secondAccount=createAccount();
                       int userChoice2;
                         boolean quit2 = false;
                         Write();
                            do {                  
                                
                                 System.out.println("ACCOUNT OPERATIONS");
                                 firstAccount.show();
                                 System.out.print("Please select the process you want to do.");
                                 System.out.println("  ");
                                  System.out.println("1. Transferring");
                                   System.out.println("2. Payment");
                                   System.out.println("3. Deposit");
                                   System.out.println("4. Loan");
                                   System.out.println("5. Debit Account");
                                   System.out.println("6. Reporting");
                                   System.out.print("Your choice, 0 to quit: ");
                                   userChoice2 = in.nextInt();
                                   switch(userChoice2)
                                   {
                                       case 1:
                                           Write();
                                           System.out.println("Account Transferring");
                                           System.out.println("Enter the money you want to send to the second account.");
                                           double sendingTransferringMoney;
                                           sendingTransferringMoney=in.nextDouble();
                                           firstAccount.transferringAccount(secondAccount, sendingTransferringMoney);
                                            break;
                                       case 2:
                                           Write();
                                           System.out.println("Payment");
                                           if(firstAccount.getDebitAccount().getDebit()>0)
                                           {firstAccount.transactionsOfDebitAccount();}
                                           else{
                                               System.out.println("You don't owe");
                                           }
                                            break;
                                       case 3:
                                           Write();
                                           System.out.println("Deposit");
                                           firstAccount.makeDeposit();
                                           break;
                                       case 4:
                                           Write();
                                           System.out.println("Loan");
                                           firstAccount.makeLoan();
                                           break;
                                       case 5:
                                           Write();
                                           System.out.println("Debit Account");
                                           System.out.println("Debit Account's Informantion"+firstAccount.debitAccount.getDebit());
                                           break;
                                       case 6:
                                           Write();
                                           int userChoices;
                                           boolean quiting=false;
                                           do{
                                               System.out.println("Account's Report");
                                           System.out.println("Enter raport type");
                                           System.out.println("1. Transferring");
                                                System.out.println("2. Payment");
                                                System.out.println("3. Deposit");
                                                System.out.println("4. Loan");
                                                System.out.println("5. Debit Account");
                                                System.out.print("Your choice, 0 to quit: ");
                                                userChoices = in.nextInt();
                                                   switch (userChoices) {
                                                        case 1:
                                                               System.out.println("Transferring");
                                                               firstAccount.historyOfOperation.show("Transferring");
                                                        break;
                                                        case 2:
                                                             System.out.println("Payment");
                                                             firstAccount.historyOfOperation.show("Payment");
                                                        break;
                                                        case 3:
                                                             System.out.println("Deposit");
                                                             firstAccount.historyOfOperation.show("Deposit");
                                                        break;
                                                       case 4:
                                                             System.out.println("Loan");
                                                             firstAccount.historyOfOperation.show("Loan");
                                                        break;
                                                         case 5:
                                                              System.out.println("Debit");
                                                             firstAccount.historyOfOperation.show("Debit");
                                                             break;
                                                          case 0:

                                                                quiting = true;

                                                                    break;
                                                         default:

                                                                System.out.println("Wrong choice.");

                                                                     break;
                                                         
                                                       
                                                   }
                                                   System.out.println();
                                           }while(!quiting);
                                           break;
                                        case 0:

                                            quit2 = true;

                                                 break;
                                        default:

                                                System.out.println("Wrong choice.");

                                                     break;
                                           
                                           
                                   }
                                  System.out.println();
                               } while (!quit2);
                                System.out.println("Bye!");
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
    









// boolean ad = false;
        // TODO code application logic here
     /*   InterBankPaymentMediator mediator = new InterBankPayment();
    
   Bank Abank= new BankImpl(1000, (InterBankPayment) mediator);
   Bank Bbank=new BankImpl(1200, (InterBankPayment) mediator);
   
   mediator.addBank(Bbank);
   mediator.addBank(Abank);
   Abank.transferringBank(Bbank, 1500);*/
  /*   Date firstDate= new GregorianCalendar(2018,11,9,00,00).getTime(); 
    Date lastDate= new GregorianCalendar(2025,12,8,00,00).getTime();
    InterestRate Ainterestrate= new InterestRate(3000,1000,firstDate,lastDate);
        System.out.println("betweee"+Ainterestrate.calculationBetweenTwoDates());
        System.out.println("interet rate"+Ainterestrate.calculationInterestRate());1
        System.out.println("son durum"+ Ainterestrate.changeOfInterestRate(3000, 2200, firstDate, lastDate));
       */ 
 /* DebitAccount debitAccount=new DebitAccount(4000);
  Account account=new AccountImpl(3000, debitAccount);
  debitAccount.payment(account,1200);
        System.out.println(account.debitAccount.getDebit());
        System.out.println(account.getBalance());*/
 //createBank();

 /*Bank bank=new BankImpl("ankara", 20000,mediatorBankPayment);
   Bank bank1=new BankImpl("istanbul", 30000,mediatorBankPayment);
   
   bank.creatingBank();
   bank1.creatingBank();
   banOperation(bank1);*/
          
           
     
          
            
       /*    Account ad1=createAccount();
           ad1.debitAccount.setDebit(2000);
           System.out.println("old debit"+ ad1.debitAccount.getDebit());
           ad1.transactionsOfDebitAccount();
          // ad1.receiving(3000);
           System.out.println("new debit"+ ad1.debitAccount.getDebit());
           System.out.println("balance"+ad1.balance);*/
        /*   ad1.makeLoan();
           System.out.println("ad1 balance ="+ad1.balance);
           System.out.println("ad1 debit ="+ad1.debitAccount.getDebit());*/
          /* ad1.makeDeposit();------->  yapıldı 2 si
         
           ad1.withDrawal();*/
          // ad1.deposit.withDrawal(ad1);
            //Account ad2=createAccount();
           // ad1.accountOperation(ad2, 1);
        
        

    }
    
    
   private static void createBank()
    {
        InterBankPayment mediatorBankPayment=new InterBankPayment();
        Bank bank1=BankFactory2.getBank(new BankFactory("ABank", 200000,mediatorBankPayment));
        Bank bank2=BankFactory2.getBank(new BankFactory("Bbank", 400000,mediatorBankPayment));
       mediatorBankPayment.addBank(bank1);
        mediatorBankPayment.addBank(bank2);
        
        bank1.bankOperation(bank2);
    }
  private static AccountMediatorImpl acccountMediator=new AccountMediatorImpl();
  
   private static Account createAccount()
   {
        Scanner in = new Scanner(System.in);
    int id;
   String owner;
    double balance;
     int day,mounth,year;
       System.out.println("Create digit id");
       id=in.nextInt();
       System.out.println("Enter your first name.");
       owner=in.next();
         System.out.println("Enter your balance.");
         balance=in.nextDouble();
          System.out.println("Enter today date DAY/MOUNTH/YEAR");
        day=in.nextInt();
        mounth=in.nextInt();
        year=in.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
       
        Account account=new AccountImpl(id, owner, nowDate, balance,acccountMediator);
        acccountMediator.addAccount(account);
     return account;
        
        
   }
   private static void Write()
   {
       System.out.println("--------------------------------------");
       System.out.println("--------------------------------------");
       System.out.println("--------------------------------------");
       System.out.println("--------------------------------------");
       
   }
   
    
    
}
