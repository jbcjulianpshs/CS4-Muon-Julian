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
public class IntroToClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student brandon = new Student("brandon");        
        Student rael = new Student("rael");
        rael.grade = 4.20;
        brandon.grade = 7.27;
        
        brandon.introduce();
        rael.introduce();
        brandon.bff = rael;
        rael.bff = brandon;
        System.out.println(brandon.bff.grade);
        System.out.println(rael.bff.grade);
        
        double g1 = brandon.getGrade();
    }
    
}
