/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

/**
 *

 */
public interface Accounts {
      void addAccount(Account account);
    void removeAccount(Account account);
    void notifyObserver();
}
