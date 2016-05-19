package io.bryantcason;

import java.util.Scanner;

/**
 * Created by bryantcason on 5/18/16.
 */
public class Driver {

    public void engine(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int answer = input.nextInt();
            input.nextLine();
        String [] types = new String [answer];
        String [] names = new String [answer];

        for(int i = 0; i < answer; i++) {

            System.out.println("What is the type?");
            types[i] = input.nextLine();
            System.out.println("What are the names?");
            names[i] = input.nextLine();
        }

        for(int i = 0; i < answer; i++){
            System.out.println(types[i] + " " + names[i]);
        }



    }


}
