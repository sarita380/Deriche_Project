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

/***********************************************************
 *
 * @author Sara
 *************************************************************/
public class GoalTest {
    
    public GoalTest() {
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

    /*****************************************************
     * Test of setId method, of class Goal.
     ****************************************************/
    @Test
    public void testSetId() {
        System.out.println("setId");
        String i = "";
        Goal instance = new Goal();
        instance.setId(i);
        
    }

    /******************************************************
     * Test of getId method, of class Goal.
     *****************************************************/
    @Test
    public void testGetId() {
        System.out.println("getId");
        Goal instance = new Goal();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**********************************************************
     * Test of setDescription method, of class Goal.
     *********************************************************/
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String d = "";
        Goal instance = new Goal();
        instance.setDescription(d);
        
    }

    /******************************************************
     * Test of getDescription method, of class Goal.
     *******************************************************/
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Goal instance = new Goal();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
    }

    /****************************************************
     * Test of display method, of class Goal.
     ****************************************************/
    @Test
    public void testDisplay() {
        System.out.println("display");
        Goal instance = new Goal();
        instance.display();
        
    }

    /*******************************************************
     * Test of selectDB method, of class Goal.
     ******************************************************/
    @Test
    public void testSelectDB() {
        System.out.println("selectDB");
        String i = "";
        Goal instance = new Goal();
        instance.selectDB(i);
        
    }

    /*****************************************************
     * Test of insertDB method, of class Goal.
     *****************************************************/
    @Test
    public void testInsertDB() {
        System.out.println("insertDB");
        String i = "";
        String d = "";
        Goal instance = new Goal();
        instance.insertDB(i, d);    
    }
    /************************************************************
     * Test of updateDB method, of class Goal.
     ************************************************************/
    @Test
    public void testUpdateDB() {
        System.out.println("updateDB");
        Goal instance = new Goal();
        instance.updateDB();
        
    }

    /****************************************************************
     * Test of deleteDB method, of class Goal.
     ****************************************************************/
    @Test
    public void testDeleteDB() {
        System.out.println("deleteDB");
        Goal instance = new Goal();
        instance.deleteDB();
        
    }
    
}
