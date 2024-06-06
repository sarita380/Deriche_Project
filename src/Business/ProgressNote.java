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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Aaron
 */
public class ProgressNote {
    //properties
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    public Calendar cal = Calendar.getInstance();
    public java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
    public Participant p = new Participant();
    private String noteid;
    private String progressnote;
    private String idp;
    //constructors
    public ProgressNote(){
        java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
        noteid = "";
        idp="";
        progressnote = "";
        Participant p = new Participant();
    }
    public ProgressNote(String i){
        selectDB(i);
    }
    //behaviors
    public void setNoteId(String n){noteid = n;}
    public String getNoteId(){return noteid;}
    public void setIdp(String i){idp = i;}
    public String getIdp(){return idp;}
    public void setProgressNote(String n){progressnote = n;}
    public String getProgressNote(){return progressnote;}
    
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
            String sql = "SELECT * FROM notes WHERE noteid = '"+i+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            rs.next();
            noteid = rs.getString(1);
            date = rs.getDate(2);
            idp = rs.getString(3);
            progressnote = rs.getString(4);
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }//end selectDB()
    public void insertDB(String i, Date d, String p, String pn){
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
            pn = sqlReplace(pn);
            String sql = "INSERT into notes values('"+i+"', '"+d+"', '"+p+"', '"+pn+"')";
            System.out.println(sql);
            int x = stmt.executeUpdate(sql);
            
            //processing data
            if (x > 0){
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
    }//end insertDB
    public void display(){
        System.out.println(noteid);
        System.out.println(date);
        System.out.println(idp);
        System.out.println(progressnote);
    }
    public String sqlReplace(String s){
        s = s.replaceAll("'", "\\\\'");
        s = s.replaceAll("&", "\\\\&");
        s = s.replaceAll("\"", "\\\\\"");
        return s;
    }
    
    
     public void findSelectDB(String i,Date d){
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
            String sql = "SELECT * FROM notes WHERE idp = '"+i+"' and date = '"+d+"'";
            System.out.println(sql);
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            
            //processing data
            rs.next();
            noteid = rs.getString(1);
            date = rs.getDate(2);
            idp = rs.getString(3);
            progressnote = rs.getString(4);
            
            //closing connection
            con.close();
            System.out.println("Connection closed");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }//end selectDB()
    
    public static void main(String args[]){
        ProgressNote pn = new ProgressNote();        
        //pn.insertDB("2015-07-25_smith", date, "objective1", "33", "test");
    }
}
