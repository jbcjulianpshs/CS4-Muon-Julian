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
public class WaterType extends Monster{
    
    public WaterType(String n, int m, int base){
        super(n, "Water", "Fire", "Grass", m, base);
        
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special(){
        super.special();
        def += 2;
        hp -= maxHP*0.10;
    }
}
