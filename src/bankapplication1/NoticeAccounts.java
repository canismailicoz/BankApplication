/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 
 */
public class NoticeAccounts implements Accounts {

        private List<Account> accountList = new ArrayList<>();
        private Operation operation;

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    @Override
    public void addAccount(Account account) {
      accountList.add(account);
    }

    @Override
    public void removeAccount(Account account) {
       accountList.remove(account);
    }

    @Override
    public void notifyObserver() {
        for (Account account : accountList) {
            account.notify(operation);
        }
    }
    
}
