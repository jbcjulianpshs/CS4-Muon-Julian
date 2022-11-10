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
public class FireType extends Monster{
    
    
    public FireType (String n, int m, int base){
        super(n, "Fire", "Grass", "Water", m, base);
        
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special (){
        super.special();
        atk += 2;
        hp -= maxHP*0.10;
    }
}
