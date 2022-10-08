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
public class Q1_exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pen penOne = new Pen();
        penOne.setName("Brandon");
        Pen penTwo = new Pen();
        penTwo.setName("Rael");
        Pen penThree = new Pen();
        penThree.setName("Akira");
        
        Song bakaMitai = new Song();
        bakaMitai.setName("Baka Mitai");
        Song lagtrain = new Song();
        lagtrain.setName("Lagtrain");
        Song envyBaby = new Song();
        envyBaby.setName("Envy Baby");
        
        Singer kanisur = new Singer();        
        kanisur.setNamePerformancesEarningsSong("Kanisur", 10, 1000, lagtrain);
        
        Singer luna = new Singer();
        luna.setNamePerformancesEarningsSong("Luna", 12, 1200, bakaMitai);
        
        kanisur.getInfo();
        
        kanisur.performForAudience(12);
        
        kanisur.changeFavSong(envyBaby);
        
        kanisur.getInfo();
        
        kanisur.performForAudience(10, luna);
        
        kanisur.getInfo();
        
        luna.getInfo();
        
        Singer.getTotalPerformances();
    }
    
}