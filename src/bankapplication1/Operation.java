
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
public class Operation {

 
    private String typeOfOperation;
    private Date dateOfOperation;
    private String descriptionOfOperation;
    public Operation(String typeOfOperation, Date dateOfOperation, String descriptionOfOperation) {
        this.typeOfOperation = typeOfOperation;
        this.dateOfOperation = dateOfOperation;
        this.descriptionOfOperation = descriptionOfOperation;
    }

   

    public String getTypeOfOperation() {
        return typeOfOperation;
    }

    public void setTypeOfOperation(String typeOfOperation) {
        this.typeOfOperation = typeOfOperation;
    }

    public Date getDateOfOperation() {
        return dateOfOperation;
    }

    public void setDateOfOperation(Date dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
    }

    public String getDescriptionOfOperation() {
        return descriptionOfOperation;
    }

    public void setDescriptionOfOperation(String descriptionOfOperation) {
        this.descriptionOfOperation = descriptionOfOperation;
    }
    
   
  
       
    }
