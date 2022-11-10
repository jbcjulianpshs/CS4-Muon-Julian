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
public class GrassType extends Monster{
    
    public GrassType (String n, int m, int base){
        super(n, "Grass", "Water", "Fire", m, base);
    }
    
    @Override
    public void rest(){
        hp += maxHP * 0.50;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special (){
        super.special();
        hp += maxHP*0.20;
    }
}
