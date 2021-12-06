package com.company;

import java.util.Scanner;

public class Main {
    private static String[] words = {"apple", "banana", "pineapple", "lemon", "orange"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String dash = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 0;
    //    private static String yes = "";
//    private static String res = "";
    static Scanner scan = new Scanner(System.in);
//    private static boolean playAgain2;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("H A N G M A N\n" +
                "\n" +
                "+---+\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "      |\n" +
                "\n" +
                "    ===\n" +
                "\n" +
                "Missed letters:");
        while ((count < 6 && dash.contains("_"))) {
            System.out.println(dash);
            System.out.println("Guess a letter");
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }


    public static void hang(String guess) {
        String newdash = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newdash += guess.charAt(0);
            } else if (dash.charAt(i) != '_') {
                newdash += word.charAt(i);
            } else {
                newdash += "_";
            }
        }

        if (dash.equals(newdash)) {
            count++;
            hangmanImage();
        } else {
            dash = newdash;
        }
        if (dash.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }

    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    " O    |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
        }
        if (count == 2) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    "  |   |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
        }
        if (count == 3) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    " /|   |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
        }
        if (count == 4) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    " /|\\  |\n" +
                    "\n" +
                    "      |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
        }
        if (count == 5) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    " /|\\  |\n" +
                    "\n" +
                    " /    |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
        }
        if (count == 6) {
            System.out.println("H A N G M A N\n" +
                    "\n" +
                    "+---+\n" +
                    "\n" +
                    "  O   |\n" +
                    "\n" +
                    " /|\\  |\n" +
                    "\n" +
                    " / \\  |\n" +
                    "\n" +
                    "    ===\n" +
                    "\n" +
                    "Missed letters:");
            System.out.println("Game Over :(");
            System.out.println("Do you want to play again? (yes or no)");
            System.out.println(scan.nextLine());
        }
    }
}
