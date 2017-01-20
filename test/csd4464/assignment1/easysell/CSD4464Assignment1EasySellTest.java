/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.easysell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0683339
 */
public class CSD4464Assignment1EasySellTest {
    
    public CSD4464Assignment1EasySellTest() {
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
     * Test of main method, of class CSD4464Assignment1EasySell.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CSD4464Assignment1EasySell.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of stringPower method, of class CSD4464Assignment1EasySell.
     */
    
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String s ="";
        int i = 9;
        String expResult ="";
        String result = CSD4464Assignment1EasySell.stringPower(s, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    public void  testLessThanOneShouldReturnNull(){
    System.out.println("stringPower");
        String s = "";
        int i = 0;
        String expResult = null;
        String result = CSD4464Assignment1EasySell.stringPower(s, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
}
    public void  testStringAndOneShouldReturnString(){
    System.out.println("stringPower");
        String s ="";
        int i = 1;
        String expResult ="d";
        String result = CSD4464Assignment1EasySell.stringPower(s, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    
}
}