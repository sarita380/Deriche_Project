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

/**
 * DeRiche_Project User Business Object
 *
 * @author Sara ****************************************************************
 */
public class User {

    //properties
    private String id;
    private String password;
    private String fname;
    private String lname;
    private String level;

    /**
     * 
     * constructors ***********************************************
     */
    public User() {
        id = "";
        password = "";
        fname = "";
        lname = "";
        level = "";
    }

    public User(String i, String pw, String fn, String ln, String l) {
        id = i;
        password = pw;
        fname = fn;
        lname = ln;
        level = l;

        insertDB(i, pw, fn, ln, l);
    }

    public User(String i) {
        selectDB(i);
    }

    /**
     * **************************************
     * behaviors ************************************
     */
    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public void setPassword(String pw) {
        password = pw;
    }

    public String getPassword() {
        return password;
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

    public void setLevel(String l) {
        level = l;
    }

    public String getLevel() {
        return level;
    }

    public void display() {
        System.out.println("User ID: " + id);
        System.out.println("Password: " + password);
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Level: " + level);
    }//end display

    /**
     * ********************************************
     * Select Method ********************************************
     */
    public void selectDB(String i) {
        try {
            /**
             * ************loading driver**************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ***********connecting database*****************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * *****************creating statement*****************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * ************executing SQL statement*******************
             */
            String sql = "SELECT * FROM Users WHERE id = '" + i + "'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);

            /**
             * ****************processing data*************************
             */
            rs.next();
            id = rs.getString(1);
            password = rs.getString(2);
            fname = rs.getString(3);
            lname = rs.getString(4);
            level = rs.getString(5);

            /**
             * **************************closing connection**************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * ***end selectDB*****
     */
    /**
     * *******************************************************
     * Insert Method
     *
     * @param i
     * @param pw
     * @param fn
     * @param ln
     * @param l *******************************************************
     */
    public void insertDB(String i, String pw, String fn, String ln, String l) {
        try {
            /**
             * ************loading driver***************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ****************connecting database**********
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * ************creating statement********************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * ************************executing SQL statement*****************
             */
            String sql = "INSERT into Users values('" + i + "', '" + pw + "', '" + fn + "', '" + ln + "', '" + l + "')";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * *****************processing
             * data**********************************
             */
            if (n > 0) {
                System.out.println("Insert successful");
            } else {
                System.out.println("Insert not successful");
            }

            /**
             * *********closing connection**********************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
        /**
         * ******************filling the object*************
         */
        setId(i);
        setPassword(pw);
        setFname(fn);
        setLname(ln);
        setLevel(l);
    }

    /**
     * **************end insertDB********************
     */
    /**
     * ***********************************************
     * Update method ***********************************************
     */
    public void updateDB() {
        try {
            /**
             * ***********loading driver********************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ***********connecting database******************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * *********************creating statement*****************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            //executing sql statement
            String sql = "UPDATE Users set password = '" + getPassword() + "', firstName = '" + getFname() + "', lastName = '" + getLname() + "', level = '" + getLevel() + "' WHERE id = '" + getId() + "'";
            //String sql = "UPDATE Participant set name = '"+getFname()+"', lastName = '"+getLname()+"' WHERE idp = '"+getId()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * ****************processing data******************
             */
            if (n > 0) {
                System.out.println("Update successful");
            } else {
                System.out.println("Update not successful");
            }

            /**
             * ************************closing connection*******************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * ******************end updateDB**************************
     */
    /**
     * **************************************************
     * Delete method *************************************************
     */
    public void deleteDB() {
        try {
            /**
             * **********loading driver**********************
             */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            /**
             * ***************connecting database***************
             */
            String connURL = "jdbc:mysql://localhost/deriche_data?";
            Connection con = DriverManager.getConnection(connURL + "user=root");
            System.out.println("Database connected");

            /**
             * ****************creating statement*******************
             */
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            /**
             * ********************executing SQL statement******************
             */
            String sql = "DELETE FROM Users WHERE id = '" + getId() + "'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);

            /**
             * *****************processing data****************************
             */
            if (n > 0) {
                System.out.println("Delete successful");
            } else {
                System.out.println("Delete not successful");
            }

            /**
             * ********************closing connection**********************
             */
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//end deleteDB
  /*  public static void main(String args[]){
     User u1 = new User("1");
     }//end main*/

    public static void main(String args[]) {
        User u1 = new User();
        u1.selectDB("1");
        u1.display();

    }

}
