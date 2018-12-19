/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.LinkedList;

/**
 *
 * 
 */
public class HistoryOfOperation {
    private LinkedList<Operation> operations;

   /* public HistoryOfOperation(LinkedList<Operation> operations) {
        this.operations = operations;
    }*/

    public HistoryOfOperation() {
       operations=new LinkedList<Operation>();
    }
    
    
    public void addOperation(Operation operation)
    {
       operations.add(operation);
    }
    public void show(String type)
    {
        for(Operation operation:operations)
        {
            if(operation.getTypeOfOperation()==type)
            {
            System.out.println(operation.getTypeOfOperation()+" "+operation.getDateOfOperation()+"  "+operation.getDescriptionOfOperation());
        
            }
            
        }
        
    }
}
