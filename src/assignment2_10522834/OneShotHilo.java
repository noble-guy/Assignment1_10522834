/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522834;

/**
 *
 * @author albert
 */
import java.util.Random;
import java.util.Scanner;
public class OneShotHilo {
    public static void main(String[] args){

        Random r = new Random();
        Scanner input = new Scanner (System.in);
        int yourGuess,myNum;

        myNum = 1+r.nextInt(100);

        System.out.println("I am thinking of a number between 1-100.Try to guess it");
        yourGuess = input.nextInt();
        System.out.println();

        if(yourGuess == myNum)
            System.out.println("You guessed it.What are the odds?!");
        else if(yourGuess < myNum)
            System.out.println("Sorry you are too low. I was thinking of " + myNum);
        else
            System.out.println("Sorry you are too high.I was thinking of " + myNum);
    }

}
