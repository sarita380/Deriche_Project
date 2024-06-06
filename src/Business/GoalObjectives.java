/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class GoalObjectives {
    //properties
    public ArrayList<Objective> go = new ArrayList<Objective>();
    public ArrayList<String> goalDetails = new ArrayList<String>();
    
    //constructors
    public GoalObjectives(){
        
    }
    //behaviors
    public void add(Objective o){
        go.add(o);
        goalDetails.add(o.objectiveDetails());
    }
    public void del(Objective o){
        go.remove(o);
    }
    public void display(){
        for(Objective o : go){
            o.display();
            System.out.println("");
        }
    }//end display
}
