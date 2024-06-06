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

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *  DeRiche_Project Participant Goals Business object
 * @author Aaron
 **************************************************************************
 */
public class ParticipantGoals {

    /**
     * **********properties**************
     */
    public ArrayList<Goal> alist = new ArrayList<Goal>();
    public ArrayList<String> participantGoalsList = new ArrayList<String>();
    //constructors
    public ParticipantGoals(){
        
    }
    //behaviors
    public void add(Goal g){
        try{
            alist.add(g);
        participantGoalsList.add(g.goalsDetails());
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
    public void del(Goal g){
        try{
            alist.remove(g);
            participantGoalsList.add(g.goalsDetails());
            
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
    public void display(){
        try{
        for(Goal g : alist){
            g.display();
            System.out.println("");}
        }catch(Exception e){
                System.out.print(e);
        }
    }//end display
    public void fillDB(String i){
        try{
            //loading driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
			
            //connecting database
            String connURL="jdbc:mysql://localhost/deriche_data.sql?";
            Connection con = DriverManager.getConnection(connURL + "user=root" );
            System.out.println("Database connected");
            
            //creating statement
            Statement stmt = con.createStatement();
            System.out.println("Statement created");
            
            //executing sql statement
            String sql = "SELECT idg FROM participant_goals WHERE idp = '"+i+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            Goal g1;
            while(rs.next()){
                g1 = new Goal();
                g1.selectDB(rs.getString(1));
                add(g1);
            }
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.out.println("DATABASE ERROR");
        }
    }//end fillDB(i)
    public static void main(String args[]){
        ParticipantGoals pg = new ParticipantGoals();
        pg.fillDB("101");
        pg.display();
    }//end main()
}
