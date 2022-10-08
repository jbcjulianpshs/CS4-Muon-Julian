/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise4;

/**
 *
 * @author MUON
 */
public class Pen {
    private String name;
    private String color = "Black"; 
    private String brand = "HBW";    
        
    public void setName(String penName){
        name = penName;
    }
    
    public String getName(){
        return name;
    }
}