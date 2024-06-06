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
public class AddNoteTest {
    
    public AddNoteTest() {
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
     * Test of isNum method, of class ParticipantInfo.
     */
    @Test
    public void testIsNum() {
        System.out.println("isNum");
        String s = "";
        AddNote instance = new AddNote();
        boolean expResult = false;
        boolean result = instance.isNum(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dateFormat method, of class ParticipantInfo.
     */
    @Test
    public void testDateFormat() {
        System.out.println("dateFormat");
        String d = "";
        AddNote instance = new AddNote();
        boolean expResult = false;
        boolean result = instance.dateFormat(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class ParticipantInfo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddNote.main(args);
        
    }
    
}
