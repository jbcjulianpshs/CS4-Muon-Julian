/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise3;

/**
 *
 * @author MUON
 */
public class Pen {
    String owner;
    String color = "Black"; 
    String brand = "HBW";    
    
    public Pen(String n, String c, String b){
    owner = n;
    color = c;
    brand = b;
    }
    
    public Pen(String n){
    owner = n;
    }
}