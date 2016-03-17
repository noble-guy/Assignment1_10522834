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

public class DiceDouble {
    public static void main(String[] args){
        Random r  = new Random();
        int roll1,roll2,total;

        roll1 = 1+r.nextInt(6);
        roll2 = 1+r.nextInt(6);
        total = roll1 +roll2;

        while(roll1 != roll2){

        roll1 = 1+r.nextInt(6);
        roll2 = 1+r.nextInt(6);
        total = roll1 +roll2;

        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        System.out.println("Total: " + total);
    }
       total = roll1 + roll2;
    }
}
