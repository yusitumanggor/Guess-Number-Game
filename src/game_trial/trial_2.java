
package game_trial;

import java.util.Random;
import java.util.Scanner;

public class trial_2 {
    
    public static void main(String[] args) {
    
        //How to get user input (Scanner)
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Please Enter a number : ");
        int number = scanner.nextInt();
        System.out.println("Answer Was: " + number);
        
        System.out.println("Please Enter your name : ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        
        //How to get generate random number
        Random random = new Random();
        int bound = 20;
        int num  = random.nextInt(bound)+1; //generate random number from 1 to 20
        System.out.println("Random Number : " + num);
        
    }
    
}
