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
public class NumberGuessingWithACounter {


 public static void main(String[] args){

       Random r = new Random();

    Scanner input = new Scanner(System.in);

    int yourChoice, myChoice;
    int counter = 0;



    myChoice =1+ r.nextInt(10);

    System.out.println("I've chosen a number from 1 to 10. Try to guess it");
    yourChoice = input.nextInt();
    System.out.println();
    counter ++;

    while (yourChoice != myChoice)
    {
    System.out.println("Your guess: " + yourChoice);
    System.out.println("That's incorrect guess again");
    yourChoice = input.nextInt();
    counter ++;
    }
  System.out.println("That's right! You're a good guesser.");
  System.out.println("It only took you " + counter + " tries.");

}

}
