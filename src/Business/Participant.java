/**
 * *******************************************************************
 * Class: CIST 2931 Advanced systems Project Instructor: Dave Busse Description:
 * DeRiche agency Date: <09/26/15>
 *
 * @author <Sara_Aliaga>
 * @version 1.0
 *
 * By turning in this code, I Pledge: 1. That I have completed the programming
 * assignment independently. 2. I have not copied the code from a student or any
 * source. 3. I have not given my code to any student.
 *
 ***********************************************************************
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * DeRiche_Project - participants Business Object
 *
 * @author Aaron 
 */
public class Participant {

    /**
     * properties ************************************************
     */
    private String id;
    private String fname;
    private String lname;
    public ParticipantGoals pg = new ParticipantGoals();
     //public ParticipantGoals alist2 = new ParticipantGoals();
     public ArrayList<Goal> alist = new ArrayList<Goal>();
    /* private String display;
     /*****************************************************
     constructors
     *********************************************************/

    public Participant() {
        id = "";
        fname = "";
        lname = "";
        ParticipantGoals pg = new ParticipantGoals();
    }

    public Participant(String i, String fn, String ln) {
        id = i;
        fname = fn;
        lname = ln;
        ParticipantGoals pg = new ParticipantGoals();
    }

    public Participant(String i) {
        selectDB(i);
        ParticipantGoals pg = new ParticipantGoals();
    }

    /**
     * behaviors *****************************************************
     */
    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public void setFname(String fn) {
        fname = fn;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String ln) {
        lname = ln;
    }

    public String getLname() {
        return lname;
    }

    public void display() {
        System.out.println("Participant ID: " + id);
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        pg.display();
    }

    /**
     * ***********************************************
     * end display ************************************************
     */
    public String display1() {
        String s;
        s = "Participant ID: " + id + "\n First Name: " + fname + "\n Last Name: " + lname;
        pg.display();
        return s;

    }

    /**
     * **************************************************
     * Select ***********************************************
     */
    public void selectDB(String i) {
        try {
            /**
             * ************************************************
             * loading driver *************************************************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ******************************************************
             * connecting database
             * ********************************************************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * *******************************************************
             * creating statement
             * **********************************************************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * **********************************************************
             * executing SQL statement
             * **********************************************************
             */
            String sql = "SELECT * FROM Participant WHERE idp = '" + i + "'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);

            /**
             * *********************************************************
             * processing data
             * **********************************************************
             */
            rs.next();
            id = rs.getString(1);
            fname = rs.getString(2);
            lname = rs.getString(3);

            /**
             * ******************************************************
             * closing connection
             * *****************************************************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.err.println(e);
        }
        fillGoals();
    }

    /**
     * **************************************************************
     * end selectDB
     * ****************************************************************
     */
    
    public void insertDB(String i, String fn, String ln) {
        try {
            /**
             * ***********************************************
             * loading driver ***********************************************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ***************************************************
             * connecting database
             * *******************************************************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * ***********************************************************
             * creating statement
             * **************************************************************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * *************************************************
             * executing SQL statement
             * *****************************************************
             */
            String sql = "INSERT into Participant values('" + i + "', '" + fn + "', '" + ln + "')";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * **************************************************
             * processing data
             * *****************************************************
             */
            if (n > 0) {
                System.out.println("Insert successful");
            } else {
                System.out.println("Insert not successful");
            }

            /**
             * ***********************************************
             * closing connection
             * *****************************************************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
        /**
         * **********************************************************
         * filling the object
         * **********************************************************
         */
        setId(i);
        setFname(fn);
        setLname(ln);
    }

    /**
     * ***********************end insertDB*****************************
     */
    public void updateDB() {
        try {
            /**
             * ******************loading driver***********************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * *****************connecting database**********************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * ***************creating statement****************************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * **************executing SQL statement**************************
             */
            String sql = "UPDATE Participant set name = '" + getFname() + "', lastName = '" + getLname() + "' WHERE idp = '" + getId() + "'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * ****************processing data********************************
             */
            if (n > 0) {
                System.out.println("Update successful");
            } else {
                System.out.println("Update not successful");
            }

            /**
             * ************************closing connection**********************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * *************************end updateDB*********************************
     */
    public void deleteDB() {
        try {
            /**
             * ******************loading driver******************************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * **************connecting database******************************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * *********************creating
             * statement********************************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * ******************executing SQL
             * statement*******************************
             */
            String sql = "DELETE FROM Participant WHERE idp = " + getId();
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * *******************processing
             * data*********************************
             */
            if (n > 0) {
                System.out.println("Delete successful");
            } else {
                System.out.println("Delete not successful");
            }

            /**
             * ***************************closing
             * connection********************************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * **************************end deleteDB******************************
     */
    public void fillGoals() {
        try {
            /**
             * ***************loading driver********************************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * *********************connecting database**********************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * *************************creating statement********************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * *********************executing SQL statement********************
             */
            String sql = "SELECT idg FROM participant_goals WHERE idp = '" + getId() + "'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);

            /**
             * *******************processing data*****************************
             */
            Goal g1;
            while (rs.next()) {
                g1 = new Goal();
                g1.selectDB(rs.getString(1));
                pg.add(g1);
            }

            /**
             * ******************closing connection**************************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void addGoal(Goal g){
        try{
            //loading driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
             
            //connecting database
            String connURL="jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root" );
            System.out.println("Database connected");
             
            //creating statement
            Statement stmt = con.createStatement();
            System.out.println("Statement created");
             
            //executing sql statement
            String sql = "INSERT into Participant_Goals values('" + id + "', '" + g.getId()+ "')";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
             
            //processing data
            if (n > 0){
        System.out.println("Insert successful");
            }
            else{
        System.out.println("Insert not successful");
            }
             
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void delGoal(Goal g){
        try{
            //loading driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
             
            //connecting database
            String connURL="jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root" );
            System.out.println("Database connected");
             
            //creating statement
            Statement stmt = con.createStatement();
            System.out.println("Statement created");
             
            //executing sql statement
            //String sql = "DELETE from Participant_Goals where idp = '" + id + "' & idg = '" + g.getId()+ "'";
            String sql = "DELETE from Participant_Goals where idp = '" + id + "' && idg = '" + g.getId()+ "'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
             
            //processing data
            if (n > 0){
        System.out.println("Delete successful");
            }
            else{
        System.out.println("Delete not successful");
            }
             
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//end delGoal


    /**
     * ***********************end fillGoals()*******************************
     */
    public static void main(String args[]) {
        Participant p1;
        p1 = new Participant();
        p1.selectDB("101");
        p1.display();
    }//end main
   /* public static void main(String args[]){
     Participant p1;
     p1 = new Participant();
     p1.selectDB("1001");
     p1.deleteDB();
     //p1.display();
     }*/

}
