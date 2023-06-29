
package game_trial;

import static java.lang.System.exit;
import java.util.Random;
import java.util.Scanner;

public class guestNum {
    
    public static void main(String[] args) {
        String playGame;
        
        //The Welcoming Message
        System.out.println("Hello! Welcome to Guess a Number Game");
        System.out.println("Please Input Your Name : ");
        
        
        //Asking The User Name
        Scanner scanner = new Scanner (System.in);
        String username = scanner.next();
        System.out.println("Hello " + username);
        
        //Asking The User to Start The Game
        do{
        System.out.println("\nDo you want to start this game " + username + "? (yes/no)");
        playGame = scanner.next();
             
        }while(playGame.equals("no"));
                  
        //Create The Random Number
        Random random = new Random();
        int bound = 25;
        int randomNum  = random.nextInt(bound)+1; //generate random number from 1 to 25
        System.out.println("Guess the number from 1-25");
        System.out.println("Please Guess the number : ");
        int numGuess = scanner.nextInt();
        
        int timeGuess = 0;
        boolean numWin = false;
        boolean finishGame = false;
        
        
        //Asking the user to guess the number
        while (!finishGame){
            timeGuess++;
            
            if(timeGuess < 5){
                if (numGuess == randomNum){
                numWin = true;
                finishGame = true;
                } else if (numGuess > randomNum){
                    System.out.println("Your guess number is to high. Try Again!");
                    numGuess = scanner.nextInt();
                }else{
                    System.out.println("Your guess number is to low. Try Again!");
                    numGuess = scanner.nextInt();
                }
        } else{
            finishGame = true;
        }
            
        }
        
        //Exiting The Game
        if (numWin){
            System.out.println("Congratulation! You Correctly Guess in " + timeGuess + " Guess");
        } else{
            System.out.println("Game Over!");
            System.out.println("The Number was " + randomNum);
        }
        
        System.exit(0);
    }
    
}
