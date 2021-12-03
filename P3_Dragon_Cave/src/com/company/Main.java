package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which cave will you go into?");
        int x;
        try {
            x = scan.nextInt();
            if (x == 1) {
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out it front of you!He opened  his jaws and ...\n" +
                        "Goobles you down in one bite!\n");

            } else if (x == 2) {
                System.out.println("Take my treasure");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("The value entered is invalid,please enter 1 or 2");
    }
}