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

public class NumberGuess {
    public static void main(String[] args){

    Random r = new Random();

    Scanner input = new Scanner(System.in);

    int yourChoice, myChoice;



    myChoice =1+ r.nextInt(10);

    System.out.println("I'm thinking of a number from 1 to 10");
    yourChoice = input.nextInt();
    System.out.println();
    System.out.print("Your guess: " + yourChoice);
    System.out.println(" But i was really thinking of " + myChoice);

    }
}
