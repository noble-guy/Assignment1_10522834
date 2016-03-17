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

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
                System.out.println("Enter how many times to print the message: ");
                int nOfTimes = keyboard.nextInt();

		int n = 0;
		while ( n < 10*(nOfTimes) )
		{
			System.out.println( (n+10) + ". " + message );
			n = n + 10;
		}

	}
}
