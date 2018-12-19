/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;

import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class LoansTest {
    
    public LoansTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLoansMoney method, of class Loans.
     */
   /* @Test
    public void testGetLoansMoney() {
        System.out.println("getLoansMoney");
        Loans instance = new Loans();
        double expResult = 0.0;
        double result = instance.getLoansMoney();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoansMoney method, of class Loans.
     */
   /* @Test
    public void testSetLoansMoney() {
        System.out.println("setLoansMoney");
        double loansMoney = 0.0;
        Loans instance = new Loans();
        instance.setLoansMoney(loansMoney);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of calculateDebitOfLoan method, of class Loans.
     */
    @Test
    public void testCalculateDebitOfLoan() {
        System.out.println("calculateDebitOfLoan");
        double requestedMoney = 1000;
        double balance = 1500;
          double debt = 500;
        Date firstHistoryDate = new GregorianCalendar(2018,11,9,00,00).getTime();
        Date lastHistoryDate = new GregorianCalendar(2018,12,8,00,00).getTime();
        Loans instance = new Loans();
        double expResult = 1000.0147534247;
        double result = instance.calculateDebitOfLoan(requestedMoney, balance, debt, firstHistoryDate, lastHistoryDate);
        assertEquals(expResult, result, 1000.0147534247);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of makeLoan method, of class Loans.
     */
   /* @Test
    public void testMakeLoan() {
        System.out.println("makeLoan");
         Date nowDate = new GregorianCalendar(2018,11,9,00,00).getTime();
         AccountMediatorImpl mediator=new AccountMediatorImpl();
        Account account = new AccountImpl(123,"can", nowDate, 1500, mediator);
        double requestedMoney = 1000.0;
        Date firstHistoryDate = new GregorianCalendar(2018,11,9,00,00).getTime();
        Date lastHistoryDate = new GregorianCalendar(2018,12,8,00,00).getTime();
        Loans instance = new Loans();
        instance.makeLoan(account, requestedMoney, firstHistoryDate, lastHistoryDate);
        // TODO review the generated test code and remove the default call to fail.
        double expResult=2500;
         assertEquals(expResult, account.getBalance(), 2500);
        fail("The test case is a prototype.");
    }*/
    
}
