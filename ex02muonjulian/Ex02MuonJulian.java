/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02muonjulian;

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
        
        boolean endApp = false;
        int lowerLimit = 0;
        int upperLimit = 10;
        int guesses = 3;
        
        
        
        while(endApp == false){ 
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start game");
            System.out.println("-Change settings");
            System.out.println("-End application");
        
            String whatDo = sc.nextLine();
        
            switch(whatDo){
                case "Start game":
                    char playAgain = 'n';
                    do{
                    playAgain = 'n';
                    int random = (int) Math.floor(Math.random()*(upperLimit - lowerLimit)) + lowerLimit;
                    int guessTruthValue = 0;
                     for(int guessesLeft = guesses; guessesLeft > 0; guessesLeft = guessesLeft - 1){
                         System.out.print("You have " + guessesLeft + " guess(es) left. What is your guess?");
                         int guess = sc.nextInt();
                         if(guess == random){
                             guessesLeft = 0;
                             guessTruthValue = 1;
                         }else if(guess > random){
                             System.out.print("Guess lower!");
                         }else if(guess < random){
                             System.out.print("Guess higher!");
                         }
                     
                     }
                     switch(guessTruthValue){
                        case 0:
                            System.out.println("You lost...");
                            break;
                        case 1:
                            System.out.println("You got it!");
                            break;
                    }
                     
                     System.out.print("Play again (y/n)?");
                     playAgain = sc.next().charAt(0);
                    }while(playAgain == 'y');
                    break;
                case "Change settings":
                    System.out.print("What is the lower limit of the random number?");
                    lowerLimit = sc.nextInt();
                    
                    System.out.print("What is the upper limit of the random number?");
                    upperLimit = sc.nextInt();
                    
                    System.out.print("How many guesses are allowed?");
                    guesses = sc.nextInt();
                    
                    System.out.println("Lower limit: " + lowerLimit);
                    System.out.println("Upper limit: " + upperLimit);
                    System.out.println("Guesses: " + guesses);
                    break;
                case "End application":
                    endApp = true;
                    break;
                default:
            
            }
        }
        System.out.println("Thank you for playing!");
        
        }
        
        // TODO code application logic here
    
    
}
