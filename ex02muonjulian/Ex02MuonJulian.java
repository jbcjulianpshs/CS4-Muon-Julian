/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02.muon.julian;

/**
 *
 * @author MUON
 */
import java.util.Scanner;
public class Ex02MuonJulian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{System.out.println("Welcome to Higher or Lower! What will you do?");
        System.out.println("-Start game");
        System.out.println("-Change settings");
        System.out.println("-End application");
        
        String whatDo = sc.nextLine();
        
        switch(whatDo){
            case "Start game":
                
                break;
            case "Change settings":
            
                break;
            case "End application":
                
                break;
            default:
            
        }
        }while();
        System.out.println("");
        
        }
        
        // TODO code application logic here
    
    
}
