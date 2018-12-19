/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

/**
 *

 */
public class Reporting {
    
    HistoryOfOperation historyOfOperation;

    public Reporting() {
    }

 public void showReporting(String type)
 {
     historyOfOperation.show(type);
     
 }

    public Reporting(HistoryOfOperation historyOfOperation) {
        this.historyOfOperation = historyOfOperation;
    }
    
}
