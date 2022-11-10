/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_exercise6;

/**
 *
 * @author MUON
 */
public class Q2_exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FireType salamander = new FireType("Salamander", 50, 10);
        WaterType undine = new WaterType("Undine", 50, 10);
        GrassType nymph = new GrassType("Nymph", 60, 8);
        
        Monster.deathDuel(nymph, salamander);
        
        nymph.restoreHealth();
        salamander.restoreHealth();
        
        Monster.deathDuel(salamander, undine);
        
        salamander.restoreHealth();
        undine.restoreHealth();
        
        Monster.deathDuel(undine, nymph);
        
        undine.restoreHealth();
        nymph.restoreHealth();
    }
    
}
