/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deriche_gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara
 */
public class ReviewerLookupTest {
    
    public ReviewerLookupTest() {
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
     * Test of dateFormat method, of class ReviewerLookup.
     */
    @Test
    public void testDateFormat() {
        System.out.println("dateFormat");
        String d = "";
        ReviewerLookup instance = new ReviewerLookup();
        boolean expResult = false;
        boolean result = instance.dateFormat(d);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class ReviewerLookup.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ReviewerLookup.main(args);
        
    }
    
}
