package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static Humans human = new Humans();
    static Goblins goblin = new Goblins();

    static Goblins pos;
    static Humans pos2;
    static String yes = "";

    public static void main(String[] args) {
        // write your code here
        playGame();
    }

    public static void playGame(){
        int size = 3;
        int gobs = 3;
        int hum = 2;
        ArrayList<Goblins> goblins = new ArrayList<>();

        for (int i = 0; i < gobs; i++) {
            Goblins gob = new Goblins(40, (rand.nextInt(size - 2) + 2), (rand.nextInt(size - 2)) + 2);
            goblins.add(gob);
        }

        Land land = new Land(size, human, goblins);

        int HX = 0;
        int HY = 0;
        int GX = 0;
        int GY = 0;


        do {
            boolean combat = false;
            System.out.println(land.createGrid());
            int hHealth = human.getHealth();
            System.out.println("Human's Health Before Combat: " + hHealth);
            int gHealth = goblin.getHealth();
            System.out.println("Goblins's Health Before Combat: " + gHealth);

            do {

                human.movement(land);
                System.out.println(land.createGrid());
                System.out.println("Human's Health " + hHealth);
                System.out.println("Goblin's Health " + gHealth);


                for (int i = 0; i < gobs; i++) {
                    pos = goblins.get(i);
                    GX = pos.getX();
                    GY = pos.getY();
                }


                if (human.move == 'e' || human.move == 'w') {
                    HX = human.getX();
                } else if (human.move == 'n' || human.move == 's') {
                    HY = human.getY();
                }


                if (GX == HX && GY == HY) {
                    while (hHealth >= 1 && gHealth >= 1) {
                        hHealth = hHealth - land.combat();
                        gHealth = gHealth - land.combat();

                        if (hHealth < 0) {
                            hHealth = 0;
                        }
                        if (gHealth < 0) {
                            gHealth = 0;
                        }

                        System.out.println("Human's Health: " + hHealth);
                        System.out.println("Goblin's Health: " + gHealth);
                        if (hHealth <= 0 || gHealth <= 0)
                            break;
                    }


                    if (hHealth < gHealth) {
                        System.out.println("Human is dead");
                    } else if (gHealth < hHealth) {
                        System.out.println("Goblin is dead");
                    } else {
                        System.out.println("Both are dead");
                    }
                    combat = true;
                }
            } while (!combat);

            System.out.println("Do you want to play again?(y or n)");
            yes = scan.next().toLowerCase();
        }
        while (yes.equals("y"));
        playGame();

    }
}



