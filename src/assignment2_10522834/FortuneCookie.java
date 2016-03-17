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

public class FortuneCookie {
    public static void main (String[] args)
    {
        Random r = new Random();
        int fortune;
        String response = "";
        int n1,n2,n3,n4,n5,n6;

        n1 = 1+r.nextInt(54);
        n2 = 1+r.nextInt(54);
        n3 = 1+r.nextInt(54);
        n4 = 1+r.nextInt(54);
        n5 = 1+r.nextInt(54);
        n6 = 1+r.nextInt(54);


        fortune = 1 + r.nextInt(6);

        if (fortune == 1)
            System.out.println("Fortune Cookie says: You will travel abroad");
        else if (fortune == 2)
            System.out.printf("Fortune Cookie says: You will marry a beautiful wife\n %d-%d-%d-%d-%d-%d" , n1,n2,n3,n4,n5,n6);
        else if (fortune == 3)
            System.out.println("Fortune Cookie says: You will have beautiful kids");
        else if (fortune == 4)
            System.out.printf("Fortune Cookie says: You shall have twins\n %d-%d-%d-%d-%d-%d", n1,n2,n3,n4,n5,n6);
        else if (fortune == 5)
            System.out.println("Fortune Cookie says: You shall find happiness in your new love");
        else
           System.out.printf("Fortune cookie says:  You shall win lottery this week\n %d-%d-%d-%d-%d-%d", n1,n2,n3,n4,n5,n6);

        


    }



}


