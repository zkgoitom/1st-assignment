
/*
lotto picker will generate and print out random numbers between 0-30 to the user
- figure out how to generate a random number
- repeat step 1, 5 times
- store the results of step 2
- display the result stored to the user
 */

// casing?? where are the capitol
//   pascalCase - where the first and every first letter of every new word is capitalized
//  Camer Case - the first letter of the first word is lower, but every other first letter is capitalized

import java.util.Random;


public class lottopicker {
    public static void main(String[] args) {

        // DataType variable name = thevaluetobestored
        String nameOfIt = "Application started...";
        System.out.println(nameOfIt);
        Random random = new Random();

        int numberOfNumbersGenerated = 0;
        int total = 5;

        while(numberOfNumbersGenerated < total){
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberOfNumbersGenerated = numberOfNumbersGenerated + 1;
        }


        /* programming is the combination off iteratives and conditions
        // iteratives - repeating a process over and over
        // condition - checking a condition (true/false) to decide what to do or if I should keep doing something

        // control flow - different types of statements that affect the flow of a program
            iterative -loops:
                while loop- while a conditino is true, keep executing
                do while loop- similar to a while loop, guaranteed to run once

           Condition -
            if- checks if a condition is tru,it will execute once
            else (tandem with an if)- executes if an if statement is false

        iterative */
    }
}

