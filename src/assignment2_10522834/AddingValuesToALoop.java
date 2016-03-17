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

public class AddingValuesToALoop {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int num;
        int sum = 0;

        System.out.println("I will add up the numbers you give");
        num = input.nextInt();

        while (num != 0){
            sum = sum + num;
            System.out.println("Number: " + num + "\nThe total is  " + sum + " so far");
            num = input.nextInt();
    }
        System.out.println("The total is " + sum);
    }

}
