/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aaron
 */
public class Goal {
    //properties
    private String id;
    private String description;
    public GoalObjectives go = new GoalObjectives();
    //constructors
    public Goal(){
    	id="";
        description="";
        GoalObjectives go = new GoalObjectives();
    }
    public Goal(String i, String d){
	id = i;
        description = d;
        GoalObjectives go = new GoalObjectives();
    }
    public Goal(String i){
        selectDB(i);
        GoalObjectives go = new GoalObjectives();
    }
    //behaviors
    public void setId(String i){
	id = i;
    }
    public String getId(){
	return id;
    }
    public void setDescription(String d){
	description = d;
    }
    public String getDescription(){
	return description;
    }
    public void display(){
	System.out.println("Goal ID: "+id);
	System.out.println("Description: "+description);
        go.display();
    }//end display
    public void selectDB(String i){
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
            String sql = "SELECT * FROM Goals WHERE idg = '"+i+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            rs.next();
            id = rs.getString(1);
            description = rs.getString(2);
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
        fillObjectives();
    }//end selectDB
    public void insertDB(String i, String d){
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
            String sql = "INSERT into Goals values('"+i+"', '"+d+"')";
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
        //filling the object
        setId(i);
        setDescription(d);
    }//end insertDB
    public void updateDB(){
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
            String sql = "UPDATE Goals set description = '"+getDescription()+"' WHERE idg = '"+getId()+"'";
            System.out.println(sql);
            int n = stmt.executeUpdate(sql);
            
            //processing data
            if (n > 0){
		System.out.println("Update successful");
            }
            else{
		System.out.println("Update not successful");
            }
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//end updateDB
    public void deleteDB(){
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
            String sql = "DELETE FROM Goals WHERE idg = "+getId();
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
    }//end deleteDB
    public void fillObjectives(){
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
            String sql = "SELECT ido, idg FROM objectives WHERE idg = '"+getId()+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            Objective o1;
            while(rs.next()){
                o1 = new Objective();
                o1.selectDB(rs.getString(1),rs.getString(2));
                go.add(o1);
            }
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }//end fillObjectives()
    public String goalsDetails(){
        String goalsString = "Goal ID: "+id+"\n"+description+"\n";
        return goalsString;
    }
    public static void main(String args[]){
        Goal g1 = new Goal("22");
        g1.display();
    }//end main
}
