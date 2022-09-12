/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoclasses;

/**
 *
 * @author MUON
 */
public class Student {
    String name;
    int id, friendshipPoints;
    double grade, money;
    Student bff;
    
    public Student(String n){
        this.name = n;
        friendshipPoints = 0;
        money = 0;
        grade = 2;
    }
    
    public void introduce (){
        System.out.printf("Hello, my name is %s", name + "." + "\n");
    }
    public double getGrade(){
        return grade;
    }
    public void talk(int hours){
        friendshipPoints += hours;
    }
}
