/*********************************************************************
 * Class: CIST 2931 Advanced systems Project
 * Instructor: Dave Busse
 * Description: DeRiche agency
 * Date: <09/26/15>
 * @author <Team #5>
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

/************************************************************************
 *
 * @author Sara
 ***********************************************************************/
public class ObjectiveTest {
    
    public ObjectiveTest() {
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

    /****************************************************************
     * Test of setIdo method, of class Objective.
     *****************************************************************/
    @Test
    public void testSetIdo() {
        System.out.println("setIdo");
        String i = "";
        Objective instance = new Objective();
        instance.setIdo(i);
        
    }

    /**
     * Test of getIdo method, of class Objective.
     */
    @Test
    public void testGetIdo() {
        System.out.println("getIdo");
        Objective instance = new Objective();
        String expResult = "";
        String result = instance.getIdo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdg method, of class Objective.
     */
    @Test
    public void testSetIdg() {
        System.out.println("setIdg");
        String i = "";
        Objective instance = new Objective();
        instance.setIdg(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdg method, of class Objective.
     */
    @Test
    public void testGetIdg() {
        System.out.println("getIdg");
        Objective instance = new Objective();
        String expResult = "";
        String result = instance.getIdg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Objective.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String d = "";
        Objective instance = new Objective();
        instance.setDescription(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Objective.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Objective instance = new Objective();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTimesWorked method, of class Objective.
     */
    @Test
    public void testSetTimesWorked() {
        System.out.println("setTimesWorked");
        int t = 0;
        Objective instance = new Objective();
        instance.setTimesWorked(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimesWorked method, of class Objective.
     */
    @Test
    public void testGetTimesWorked() {
        System.out.println("getTimesWorked");
        Objective instance = new Objective();
        int expResult = 0;
        int result = instance.getTimesWorked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class Objective.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        int m = 0;
        Objective instance = new Objective();
        instance.setMax(m);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class Objective.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Objective instance = new Objective();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectDB method, of class Objective.
     */
    @Test
    public void testSelectDB() {
        System.out.println("selectDB");
        String i = "";
        Objective instance = new Objective();
        instance.selectDB(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertDB method, of class Objective.
     */
    @Test
    public void testInsertDB() {
        System.out.println("insertDB");
        String i = "";
        String g = "";
        String d = "";
        int t = 0;
        int m = 0;
        Objective instance = new Objective();
        instance.insertDB(i, g, d, t, m);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateDB method, of class Objective.
     */
    @Test
    public void testUpdateDB() {
        System.out.println("updateDB");
        Objective instance = new Objective();
        instance.updateDB();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDB method, of class Objective.
     */
    @Test
    public void testDeleteDB() {
        System.out.println("deleteDB");
        Objective instance = new Objective();
        instance.deleteDB();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of objectiveDetails method, of class Objective.
     */
    /*@Test
    public void testObjectiveDetails() {
        System.out.println("objectiveDetails");
        Objective instance = new Objective();
        String expResult = "";
        String result = instance.objectiveDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of display method, of class Objective.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Objective instance = new Objective();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Objective.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Objective.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
