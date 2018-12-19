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
public class InterestRateTest {
    
    public InterestRateTest() {
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
     * Test of calculationBetweenTwoDates method, of class InterestRate.
     */
    @Test
    public void testCalculationBetweenTwoDates() {
        System.out.println("calculationBetweenTwoDates");
        InterestRate instance = new InterestRate();
        Date firstHistoryDate = new GregorianCalendar(2018,11,9,00,00).getTime();
        Date lastHistoryDate = new GregorianCalendar(2018,12,8,00,00).getTime();
        instance.setFirstHistoryDate(firstHistoryDate);
        instance.setLastHistoryDate(lastHistoryDate);
        long expResult = 30;
        long result = instance.calculationBetweenTwoDates();
        assertEquals(expResult, result,30);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of calculationInterestRate method, of class InterestRate.
     */
      @Test
    public void testCalculationInterestRate() {
        System.out.println("calculationInterestRate");
        double balance =1000;
        double debt=500;
       
        Date firstHistoryDate = new GregorianCalendar(2018,11,9,00,00).getTime();
        Date lastHistoryDate = new GregorianCalendar(2018,12,8,00,00).getTime();
       
         InterestRate instance = new InterestRate(balance, debt, firstHistoryDate, lastHistoryDate);
        
        
        double expResult = 0.0125;
        double result = instance.calculationInterestRate();
        assertEquals(expResult, result, 0.0125);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decreasingInterestRate method, of class InterestRate.
     */
  /*  @Test
    public void testDecreasingInterestRate() {
        System.out.println("decreasingInterestRate");
        InterestRate instance = new InterestRate();
        instance.decreasingInterestRate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeOfInterestRate method, of class InterestRate.
     */
  /*  @Test
    public void testChangeOfInterestRate() {
        System.out.println("changeOfInterestRate");
        double balance = 0.0;
        double debt = 0.0;
        Date firstHistoryDate = null;
        Date lastHistoryDate = null;
        InterestRate instance = new InterestRate();
        double expResult = 0.0;
        double result = instance.changeOfInterestRate(balance, debt, firstHistoryDate, lastHistoryDate);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class InterestRate.
     */
   /* @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        InterestRate instance = new InterestRate();
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class InterestRate.
     */
   /* @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 0.0;
        InterestRate instance = new InterestRate();
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDebt method, of class InterestRate.
     */
  /*  @Test
    public void testGetDebt() {
        System.out.println("getDebt");
        InterestRate instance = new InterestRate();
        double expResult = 0.0;
        double result = instance.getDebt();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDebt method, of class InterestRate.
     */
  /*  @Test
    public void testSetDebt() {
        System.out.println("setDebt");
        double debt = 0.0;
        InterestRate instance = new InterestRate();
        instance.setDebt(debt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstHistoryDate method, of class InterestRate.
     */
  /*  @Test
    public void testGetFirstHistoryDate() {
        System.out.println("getFirstHistoryDate");
        InterestRate instance = new InterestRate();
        Date expResult = null;
        Date result = instance.getFirstHistoryDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstHistoryDate method, of class InterestRate.
     */
  /*  @Test
    public void testSetFirstHistoryDate() {
        System.out.println("setFirstHistoryDate");
        Date firstHistoryDate = null;
        InterestRate instance = new InterestRate();
        instance.setFirstHistoryDate(firstHistoryDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastHistoryDate method, of class InterestRate.
     */
 /*   @Test
    public void testGetLastHistoryDate() {
        System.out.println("getLastHistoryDate");
        InterestRate instance = new InterestRate();
        Date expResult = null;
        Date result = instance.getLastHistoryDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastHistoryDate method, of class InterestRate.
     */
  /*  @Test
    public void testSetLastHistoryDate() {
        System.out.println("setLastHistoryDate");
        Date lastHistoryDate = null;
        InterestRate instance = new InterestRate();
        instance.setLastHistoryDate(lastHistoryDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */   
}
