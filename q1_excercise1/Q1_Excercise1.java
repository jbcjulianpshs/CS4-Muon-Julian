/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_excercise1;

/**
 *
 * @author MUON
 */
public class Q1_Excercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int penOnePrice = 5;
        int penTwoPrice = 15;
        int penThreePrice = 5;
        
        String penOneColor = "Red";
        String penTwoColor = "Black";
        String penThreeColor = "Blue";
        
        String penOneBrand = "HBW";
        String penTwoBrand = "Bic";
        String penThreeBrand = "HBW";
        
        int totalPrice = penOnePrice + penTwoPrice + penThreePrice;
        
        System.out.println("Pen 1");
        System.out.println("Price: " + penOnePrice);
        System.out.println("Color: " + penOneColor);
        System.out.println("Brand: " + penOneBrand + "\n");

        System.out.println("Pen 2");
        System.out.println("Price: " + penTwoPrice);
        System.out.println("Color: " + penTwoColor);
        System.out.println("Brand: " + penTwoBrand + "\n");
        
        System.out.println("Pen 3");
        System.out.println("Price: " + penThreePrice);
        System.out.println("Color: " + penThreeColor);
        System.out.println("Brand: " + penThreeBrand + "\n");
        
        System.out.println("Total price of all pens: " + totalPrice);
        System.out.print("Pen 2 is more expensive than Pen 1: ");
        System.out.println(penTwoPrice > penOnePrice);
        System.out.print("Pen 1 and Pen 3 have the same brand: ");
        System.out.println(penOneBrand == penThreeBrand);
    }
    
}
