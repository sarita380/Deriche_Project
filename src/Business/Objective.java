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
public class Objective {
    //properties
    private String ido;
    private String idg;
    private String description;
    private int timesWorked;
    private int max;
    //constructors
    public Objective(){
        ido="";
        idg="";
        description="";
        timesWorked=0;
        max=0;
    }
    public Objective(String i, String g, String d, int t, int m){
        ido=i;
        idg=g;
        description=d;
        timesWorked=t;
        max=m;
    }
    public Objective(String i){
        selectDB(i);
    }
    //behaviors
    public void setIdo(String i){ido=i;}
    public String getIdo(){return ido;}
    public void setIdg(String i){idg=i;}
    public String getIdg(){return idg;}
    public void setDescription(String d){description=d;}
    public String getDescription(){return description;}
    public void setTimesWorked(int t){timesWorked=t;}
    public int getTimesWorked(){return timesWorked;}
    public void setMax(int m){max=m;}
    public int getMax(){return max;}
    
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
            String sql = "SELECT * FROM Objectives WHERE ido = '"+i+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            rs.next();
            ido = rs.getString(1);
            idg=rs.getString(2);
            description = rs.getString(3);
            timesWorked = rs.getInt(4);
            max = rs.getInt(5);
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }//end selectDB
    public void insertDB(String i, String g, String d, int t, int m){
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
            String sql = "INSERT into Objectives values('"+i+"', '"+g+"', '"+d+"', "+t+", "+m+")";
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
        setIdo(i);
        setIdg(g);
        setDescription(d);
        setTimesWorked(t);
        setMax(m);
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
            String sql = "UPDATE objectives set description = '"+getDescription()+"', timesWorked = "+getTimesWorked()+", max = "+getMax()+" WHERE ido = '"+getIdo()+"' and idg = '"+getIdg()+"'";
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
            String sql = "DELETE FROM objectives WHERE ido = "+getIdo();
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
    
    public void selectDB(String io, String ig){
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
            String sql = "SELECT * FROM Objectives WHERE ido = '"+io+"' and idg = '"+ig+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            rs.next();
            ido = rs.getString(1);
            idg=rs.getString(2);
            description = rs.getString(3);
            timesWorked = rs.getInt(4);
            max = rs.getInt(5);
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }//end selectDB
    public String objectiveDetails(){
        String objectivesString = "Objective: "+ido+"\n"+description+"\nTimes Worked: "+timesWorked+"\nMax: "+max+"\n";
        return objectivesString;
    }
    public void display(){
        System.out.println("Objective Id: "+ido);
        System.out.println("Description: "+description);
        System.out.println("Times Worked: "+timesWorked);
        System.out.println("Max: "+max);
    }

    public static void main(String args[]){
        Objective o1 = new Objective("a");
        o1.display();
        o1.setDescription("testingAGAIN");
        o1.updateDB();
        o1.display();
    }
}
