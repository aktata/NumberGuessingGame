//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}
import java.util.Random;
import java.util.Scanner;
import java.lang.System;


/**
 * Created with IntelliJ IDEA.
 * This code was written by WuGang for object-oriented programming course assignments.
 * Don't steal code for other uses.
 * User: WuGang
 * Date: 2020/03/27
 * Time: 20:55 PM
 */
public class NumberGuessingGame {

    public static void main(String[] args){



        System.out.println("Hello and welcome to my number guessing game.");
        System.out.println("Pick a number: ");

        Scanner inputnum = new Scanner(System.in);  //This number will be the max number the player has to guess too.
        int maxnum;
        maxnum = inputnum.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maxnum);
        int tries = 0; //Will increase depending on how many tires it takes
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){  //This while loop false the code with in it repeat until win === true

            System.out.println("Guess a number between 1 and "+ maxnum +": ");
            guess = input.nextInt();
            tries++; //Increasing the number set in the variable tries by 1

            if (guess == number){
                win = true; //Since the number is correct win == true then ending the loop
                //First thing the guess is compared too
            }

            else if(guess < number){
                System.out.println("Number is to low, tray again");
                //2nd thing guess is compared too.
            }

            else if(guess > number){
                System.out.println("Number is to high, try again");
                //3rd thing guess is compared too.
            }

        }

        System.out.println("You win!");
        System.out.println("It took you "+ tries + " tries.");
        System.out.println("This code was written by WuGang for object-oriented programming course assignments.");
        System.out.println("Don't steal code for other uses");
    }
}