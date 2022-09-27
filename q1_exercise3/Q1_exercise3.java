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
public class Q1_exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pen penOne = new Pen("Brandon");
        Pen penTwo = new Pen("Rael");
        Pen penThree = new Pen("Akira");
        
        Song bakaMitai = new Song("Baka Mitai");
        Song lagtrain = new Song("Lagtrain");
        Song envyBaby = new Song("Envy Baby");
        
        Singer kanisur = new Singer("Kanisur", 10, 1000, lagtrain);
        
        kanisur.getInfo();
        
        kanisur.performForAudience(12);
        
        kanisur.changeFavSong(envyBaby);
        
        kanisur.getInfo();
    }
    
}