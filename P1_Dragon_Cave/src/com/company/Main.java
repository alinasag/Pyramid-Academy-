package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Which cave will you go into?");
        int cave = myObj.nextInt();
        System.out.println(chooseCave(cave));

    }

    public static String chooseCave(int x) {
        if (x == 1) {
            return "You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out it front of you!He opened  his jaws and ...\n" +
                    "Goobles you down in one bite!\n";

        } else if (x == 2) {
            return "Take my treasure";
        }
        return "Choose just 1 or 2";
    }
}
