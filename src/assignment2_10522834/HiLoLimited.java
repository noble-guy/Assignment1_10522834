/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522834;

/**
 *
 * @author albert
 */
import java.util.Scanner;
import java.util.Random;
public class HiLoLimited {

    public static void main(String[] args){

        Random r = new Random();
        Scanner input = new Scanner (System.in);

        int num = 1+r.nextInt(100);
        int counter  = 0;

        System.out.println("I am thinking of a number from 1-100.You have 7 guesses");
        int guess = input.nextInt();
        counter ++;

        while (guess != num && counter<7){
            if (guess < num)
                System.out.println("Guess #" + counter + ":" + guess +"\nSorry, your guess is too low");

            else if (guess > num)
                 System.out.println("Guess #" + counter + ":" + guess + "\nSorry, that guess is too high");

            if (guess == num)
                System.out.println("You guessed it! What are the odds?");

             guess = input.nextInt();
             counter ++;
         }
        System.out.println("Sorry, you didn't guess it in 7 tries. You lose!!!");

    }

}
