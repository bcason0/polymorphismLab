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
        Pet [] pet = new Pet [answer];

        for(int i = 0; i < answer; i++) {

            System.out.println("What is the type? Dog, Cat, or Lion");
            String types = input.nextLine();
            System.out.println("What are the names?");
            String name = input.nextLine();
            if(types.equals("Dog")){
                pet[i] = new Dog(name);
            } else if(types.equals(name)){
                pet[i] = new Cat(name);
            }else{
                pet[i] = new Lion(name);
            }

        }

        for(int i = 0; i < answer; i++){
            System.out.println(pet[i].getName() + " says " + pet[i].speak());
        }



    }


}
