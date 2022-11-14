/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_exercise7;

/**
 *
 * @author MUON
 */
public class Q2_exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){      
        Location asgard = new Location("Asgard", "Asgard is the land of the gods.");
        Trainer loki = new Trainer("Loki", asgard);
        WaterType jormungandr = new WaterType("Jörmungandr", 1000000000, 1000000000);
        NPC odin = new NPC("Odin", asgard, "Welcome to Asgard!");
        
        loki.inspect(jormungandr);
        loki.inspect(odin);
        loki.inspect(asgard);
    }
    
}