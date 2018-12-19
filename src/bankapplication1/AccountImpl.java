/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 
 */
public class AccountImpl extends Account {

    public AccountImpl(int id, String owner, Date date_of_opennig, double balance,AccountMediatorImpl mediator) {
        super(id, owner, date_of_opennig, balance,mediator);
    }

   /* public AccountImpl(int id, String owner, Date date_of_opennig, double balance, LinkedList<Operation> operation, HistoryOfOperation historyOfOperation, DebitAccount debitAccount, AccountMediatorImpl mediator) {
        super(id, owner, date_of_opennig, balance, operation, historyOfOperation, debitAccount, mediator);
    }*/



   /* AccountImpl(int i, DebitAccount debitAccount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    

   

    @Override
    public void receiving(double reMoney) {
         if(debitAccount.getDebit()<=0)
         {
             this.balance+=reMoney;
         }
         else if(debitAccount.getDebit()>0)
         {
             debitAccount.payment(this, reMoney);
         }
        
         
    }

         
    @Override
    public void transferringAccount(Account ReceivingAccount, double sendingMoney) {
      String type;
     type="Transferring";
        mediator.transferring(this, ReceivingAccount, sendingMoney);
       saveOperation(this, ReceivingAccount, sendingMoney, type);
         
         
        
    }
    public void addingAccounts(Account account)
    {
        mediator.addAccount(account);
    }

    @Override
    public void payment(DebitAccount debitAccount) {
        
    }

    @Override
    public void notify(Operation operation) {
        System.out.println("Process completed."+operation.getTypeOfOperation()+"  "+ operation.getDateOfOperation()+"  "+operation.getDescriptionOfOperation());
    }

 
 @Override
    public void operationMessage(Account account) {
       NoticeAccounts noticeAccounts = null;
        noticeAccounts.addAccount(this);
        noticeAccounts.addAccount(account);
        noticeAccounts.notifyObserver();
        noticeAccounts.removeAccount(account);
        noticeAccounts.removeAccount(this);
    }

    @Override
    public void makeDeposit() {
        Scanner input = new Scanner(System.in);
        double rmoney;
        
        int day,mounth,year;
        int lastday,lastmounth,lastyear;
        System.out.println("Enter the money you want to deposit.");
        rmoney=input.nextDouble();
        System.out.println("Enter today date DAY/MOUNTH/YEAR");
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
        System.out.println("Enter last date DAY/MOUNTH/YEAR");
        lastday=input.nextInt();
        lastmounth=input.nextInt();
        lastyear=input.nextInt();
        Date lastDate= new GregorianCalendar(lastyear,lastmounth,lastday,00,00).getTime();
        deposit.makeDeposit(this, rmoney, nowDate, lastDate);
        System.out.println("Deposit Money= "+rmoney);
         System.out.println("Update your balance= "+this.getBalance());
   //*/**    this.saveOperation(this, this, rmoney, owner);
  String type;
     type="Deposit";
       
        saveOperation1(this, rmoney, type, nowDate);
   /*String type;
   type="Deposit";
   String description="Deposit"+ rmoney;
   Operation operaton=new Operation(type, nowDate, description);
  // this.saveOperation1(this, rmoney, type, nowDate);
      this.historyOfOperation.addOperation(operation);*/
        
       
    }
    

    @Override
    public void makeLoan() {
        Scanner input = new Scanner(System.in);
      //  Loans loan = null;//----
        double lmoney;
        int day,mounth,year;
        int lastday,lastmounth,lastyear;
        System.out.println("Enter the money you want to loan.");
        lmoney=input.nextDouble();
        loans.setLoansMoney(lmoney);
        System.out.println("Enter today date DAY/MOUNTH/YEAR");
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
        System.out.println("Enter last date DAY/MOUNTH/YEAR");
        lastday=input.nextInt();
        lastmounth=input.nextInt();
        lastyear=input.nextInt();
        Date lastDate= new GregorianCalendar(lastyear,lastmounth,lastday,00,00).getTime();
        loans.makeLoan(this, lmoney, nowDate, lastDate);
        System.out.println("Update your balance= "+this.getBalance());
        String type;
        type="Loan";
       this.saveOperation1(this, lmoney, type, nowDate);
       
        
    }
    @Override
    public void transactionsOfDebitAccount()
    {  Scanner input = new Scanner(System.in);
    int decision;
    int day1,mounth1,year1;
        System.out.println("Debit =" + debitAccount.getDebit());
        System.out.println("Do you want to pay your debt:YES(1)/N0(0)");
        decision=input.nextInt();
        if(decision==1)
        {
            debitAccount.otherOfPayment(this.debitAccount,this);
            System.out.println("Your updated debt" + debitAccount.getDebit());
            System.out.println("Enter today date DAY/MOUNTH/YEAR");
        day1=input.nextInt();
        mounth1=input.nextInt();
        year1=input.nextInt();
        Date nowDate= new GregorianCalendar(year1,mounth1,day1,00,00).getTime();
        /*  String type="Payment";
        String description="Payment"+ debitAccount.getDebit()+" ";*/
       /* Operation operation=new Operation(type, nowDate, description);
       // account.operation.add(operation);
        this.historyOfOperation.addOperation(operation);*/
    String type="Payment";
    this.saveOperation1(this, this.debitAccount.getDebit(), type, nowDate);
        }
        else if(decision==0)
        {
            System.out.println("Pay your debt as soon as possible.");
        }
        
        
    }

    @Override
    public void accountOperation(Account secondAccount,int userChoice) {
        Scanner in = new Scanner(System.in);
        
        double sendingMoney,paymentMoney;
        boolean quit = false;
        do {
            
              switch (userChoice) {

                  case 1:
                      System.out.println("Enter the money you want to send");
                      sendingMoney=in.nextDouble();
                      transferringAccount(secondAccount, sendingMoney);
                      
                      
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
         userChoice=0;
    }while (!quit);
     System.out.println("Bye!");
 
       
    }
    
    public void saveOperation(Account firstAccount,Account secondAccount,double sendingMoney,String type)
    {
        System.out.println("Enter today date DAY/MOUNTH/YEAR");
        int day,mounth,year;
        Scanner input = new Scanner(System.in);
        day=input.nextInt();
        mounth=input.nextInt();
        year=input.nextInt();
        Date nowDate= new GregorianCalendar(year,mounth,day,00,00).getTime();
        System.out.println("The Sending Bank's Balance: "+ this.balance);
        System.out.println("Money transfer was successfully realized. "+"Amount of money sent: " + sendingMoney);  
        System.out.println(secondAccount.balance);
        if(type=="Transferring")
        {
         String description="Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
        
      //  firstBank.historyOfOperation=new HistoryOfOperation();
       /* firstBank.operation.add(operation);*/
       firstAccount.historyOfOperation.addOperation(operation);
        ////////
            System.out.println("bura kadar");
        String type1="Receiving";
        String description1="Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
        secondAccount.historyOfOperation.addOperation(operation1);
        
        }
        else if(type=="Payment")
        {
         String description="Payment Transferring"+ sendingMoney+" ";
        Operation operation=new Operation(type, nowDate, description);
        firstAccount.historyOfOperation.addOperation(operation);
        ////////
        String type1="Receiving";
        String description1="Payment Receiving"+ sendingMoney+" ";
        Operation operation1=new Operation(type1, nowDate, description1);
        secondAccount.historyOfOperation.addOperation(operation1);
        
        }
        
        
    }
    public void saveOperation1(Account firstAccount,double money,String type,Date nowDate)
    {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("The New Bank's Balance: "+ this.balance);
        if(type=="Deposit")
        {
         String description="Deposit receiving money"+ money+" ";
        Operation operation=new Operation(type, nowDate, description);
        
      //  firstBank.historyOfOperation=new HistoryOfOperation();
       /* firstBank.operation.add(operation);*/
       firstAccount.historyOfOperation.addOperation(operation);
        ////////
            System.out.println("bura kadar");
       
        
        }
        else if(type=="DepositWithDrawal")
        {
         String description="Deposit WithDrawal"+ money+" ";
        Operation operation=new Operation(type, nowDate, description);
        firstAccount.historyOfOperation.addOperation(operation);
        ////////
        
        
        }
        else if(type=="Loans")
        {
            String description="Loans "+ money+" ";
        Operation operation=new Operation(type, nowDate, description);
        firstAccount.historyOfOperation.addOperation(operation);
        }
            
        
        
    }

    @Override
    public void withDrawal() {
        deposit.withDrawal(this);
        
    }

    @Override
    public void show() {
        System.out.println("Account's id="+id);
         System.out.println("Account's owner="+owner);
         System.out.println("Account's balance"+balance);
    }

    

  

   

   
    }
    
    
    
    

   
    

