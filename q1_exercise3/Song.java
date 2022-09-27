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
public class Song {
    String name;
    String genre;
    int length;
    
    public Song(String n, String g, int l){
        name = n;
        genre = g;
        length = l;
    }
    
    public Song(String n){
        name = n;
    }
    
    public Song(String n, String g){
        name = n;
        genre = g;
    }
    
    public Song(String n, int l){
        name = n;
        length = l;
    }
}