package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("\n" + name);

        System.out.println("Well," + name + "," + "I am thinking of a number between 1 and 20. Take a guess");

        Random ran = new Random();
        int number = ran.nextInt(20);
        int guess = 0;
        int count = 0;
        String yes = "";
        String res = "";
        do {
            guess = scan.nextInt();

            if (guess == number) {
                System.out.println("Good job," + name + "!" + "You guessed my number in " + count + " guesses!"
                        + "Would you like to play again? (y or n)");
                yes = scan.nextLine();
                res += yes;
            } else if (guess < number) {
                System.out.println("Your guess is too low. Take a guess.");
                count++;
            } else if (guess > number) {
                System.out.println("Your guess is too high. Take a guess.");
                count++;
            }
            yes = scan.nextLine();
            res += yes;
        } while (guess != number || res.equals("y"));
    }
}

