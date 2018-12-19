/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;

/**
 *

 */
public class Loans {
    private double loansMoney;

    public Loans() {
    }

    public double getLoansMoney() {
        return loansMoney;
    }

    public void setLoansMoney(double loansMoney) {
        this.loansMoney = loansMoney;
    }
    

    public Loans(double loansMoney) {
        this.loansMoney = loansMoney;
    }
     public double calculateDebitOfLoan(double requestedMoney,double balance, double debt, Date firstHistoryDate, Date lastHistoryDate)
    {
        double calculatedLoan;
        double debtSumLoan;
        InterestRate LoanInterestRate=new InterestRate(balance, debt, firstHistoryDate, lastHistoryDate);
        calculatedLoan=(requestedMoney/100)*(LoanInterestRate.calculationInterestRate()/365)*(LoanInterestRate.calculationBetweenTwoDates());
        debtSumLoan=requestedMoney+calculatedLoan;
        return debtSumLoan;
    }
    public void makeLoan(Account account,double requestedMoney,Date firstHistoryDate, Date lastHistoryDate)
    {
        loansMoney=calculateDebitOfLoan(requestedMoney,account.getBalance(), account.getDebitAccount().getDebit(), firstHistoryDate, lastHistoryDate);
        account.receiving(requestedMoney);
        account.debitAccount.addingDebt(loansMoney,account);
        /*String type;
        type="DebitAccount";
        account.saveOperation1(account, loansMoney, type, firstHistoryDate);
        System.out.println("Your credit debt= "+ account.debitAccount.getDebit());*/
          String type="Loan";
        String description="Loan"+ loansMoney+" ";
        Operation operation=new Operation(type, firstHistoryDate, description);
       // account.operation.add(operation);
        account.historyOfOperation.addOperation(operation);
          
    }
    
    
}
