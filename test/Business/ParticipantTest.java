/*********************************************************************
 * Class: CIST 2931 Advanced systems Project
 * Instructor: Dave Busse
 * Description: DeRiche agency
 * Date: <09/26/15>
 * @author <Sara_Aliaga>
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 ************************************************************************/

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
public class ParticipantTest {
    
    public ParticipantTest() {
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
     * Test of setId method, of class Participant.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String i = "";
        Participant instance = new Participant();
        instance.setId(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Participant.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Participant instance = new Participant();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFname method, of class Participant.
     */
    @Test
    public void testSetFname() {
        System.out.println("setFname");
        String fn = "";
        Participant instance = new Participant();
        instance.setFname(fn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*********************************************************
     * Test of getFname method, of class Participant.
     **********************************************************/
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Participant instance = new Participant();
        String expResult = "";
        String result = instance.getFname();
        assertEquals(expResult, result);
       
    }

    /*************************************************
     * Test of setLname method, of class Participant.
     ****************************************************/
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String ln = "";
        Participant instance = new Participant();
        instance.setLname(ln);
        
    }

    /********************************************************
     * Test of getLname method, of class Participant.
     *********************************************************/
    @Test
    public void testGetLname() {
        System.out.println("getLname");
        Participant instance = new Participant();
        String expResult = "";
        String result = instance.getLname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Participant.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Participant instance = new Participant();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectDB method, of class Participant.
     */
    @Test
    public void testSelectDB() {
        System.out.println("selectDB");
        String i = "";
        Participant instance = new Participant();
        instance.selectDB(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertDB method, of class Participant.
     */
    @Test
    public void testInsertDB() {
        System.out.println("insertDB");
        String i = "";
        String fn = "";
        String ln = "";
        Participant instance = new Participant();
        instance.insertDB(i, fn, ln);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateDB method, of class Participant.
     */
    @Test
    public void testUpdateDB() {
        System.out.println("updateDB");
        Participant instance = new Participant();
        instance.updateDB();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDB method, of class Participant.
     */
    @Test
    public void testDeleteDB() {
        System.out.println("deleteDB");
        Participant instance = new Participant();
        instance.deleteDB();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**************************************************
     * Test of fillGoals method, of class Participant.
     ***************************************************/
    @Test
    public void testFillGoals() {
        System.out.println("fillGoals");
        Participant instance = new Participant();
        instance.fillGoals();
        
    }

   
   
    
}
