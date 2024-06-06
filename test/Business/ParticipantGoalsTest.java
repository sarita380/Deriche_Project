/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

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
public class ParticipantGoalsTest {
    
    public ParticipantGoalsTest() {
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
     * Test of add method, of class ParticipantGoals.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Goal g = null;
        ParticipantGoals instance = new ParticipantGoals();
        instance.add(g);
        
    }

    /**
     * Test of del method, of class ParticipantGoals.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        Goal g = null;
        ParticipantGoals instance = new ParticipantGoals();
        instance.del(g);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class ParticipantGoals.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        ParticipantGoals instance = new ParticipantGoals();
        instance.display();
        
    }

    /**
     * Test of fillDB method, of class ParticipantGoals.
     */
    @Test
    public void testFillDB() {
        System.out.println("fillDB");
        String i = "";
        ParticipantGoals instance = new ParticipantGoals();
        instance.fillDB(i);
        
    }

    /**
     * Test of main method, of class ParticipantGoals.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParticipantGoals.main(args);
        
    }
    
}
