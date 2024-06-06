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

/**********************************************************
 *
 * @author Sara
 *************************************************************/
public class UserTest {
    
    public UserTest() {
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

    /************************************************************
     * Test of setId method, of class User.
     **************************************************************/
    @Test
    public void testSetId() {
        System.out.println("setId");
        String i = "1001";
        User instance = new User();
        instance.setId(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /********************************************************
     * Test of getId method, of class User.
     *********************************************************/
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = new User();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /********************************************************
     * Test of setPassword method, of class User.
     ***********************************************************/
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String pw = "";
        User instance = new User();
        instance.setPassword(pw);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /***************************************************************
     * Test of getPassword method, of class User.
     ***************************************************************/
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /*************************************************************
     * Test of setFname method, of class User.
     *************************************************************/
    @Test
    public void testSetFname() {
        System.out.println("setFname");
        String fn = "";
        User instance = new User();
        instance.setFname(fn);
        
    }

    /****************************************************
     * Test of getFname method, of class User.
     ******************************************************/
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        User instance = new User();
        String expResult = "";
        String result = instance.getFname();
        assertEquals(expResult, result);
        
    }

    /************************************************************
     * Test of setLname method, of class User.
     ************************************************************/
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String ln = "";
        User instance = new User();
        instance.setLname(ln);
       
    }

    /*********************************************************
     * Test of getLname method, of class User.
     ********************************************************/
    @Test
    public void testGetLname() {
        System.out.println("getLname");
        User instance = new User();
        String expResult = "";
        String result = instance.getLname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /********************************************************************
     * Test of setLevel method, of class User.
     *******************************************************************/
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        String l = "";
        User instance = new User();
        instance.setLevel(l);
        
    }

    /*****************************************************************
     * Test of getLevel method, of class User.
     ****************************************************************/
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        User instance = new User();
        String expResult = "";
        String result = instance.getLevel();
        assertEquals(expResult, result);
        
    }

    /*************************************************************
     * Test of display method, of class User.
     ***************************************************************/
    @Test
    public void testDisplay() {
        System.out.println("display");
        User instance = new User();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /******************************************************************
     * Test of selectDB method, of class User.
     *****************************************************************/
    @Test
    public void testSelectDB() {
        System.out.println("selectDB");
        String i = "";
        User instance = new User();
        instance.selectDB(i);
        
    }

    /******************************************************************
     * Test of insertDB method, of class User.
     *****************************************************************/
    @Test
    public void testInsertDB() {
        System.out.println("insertDB");
        String i = "";
        String pw = "";
        String fn = "";
        String ln = "";
        String l = "";
        User instance = new User();
        instance.insertDB(i, pw, fn, ln, l);
        
    }

    /**********************************************************************
     * Test of updateDB method, of class User.
     *********************************************************************/
    @Test
    public void testUpdateDB() {
        System.out.println("updateDB");
        User instance = new User();
        instance.updateDB();
        
    }

    /*********************************************************
     * Test of deleteDB method, of class User.
     ********************************************************/
    @Test
    public void testDeleteDB() {
        System.out.println("deleteDB");
        User instance = new User();
        instance.deleteDB();
        
    }
    
}
