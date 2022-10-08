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
public class Song {
    private String name;
    private String genre;
    private int length;
    
    public String getName(){
        return name;
    }
    
    public void setNameGenreLength(String n, String g, int l){
        name = n;
        genre = g;
        length = l;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setNameGenre(String n, String g){
        name = n;
        genre = g;
    }
    
    public void setNameLength(String n, int l){
        name = n;
        length = l;
    }
}