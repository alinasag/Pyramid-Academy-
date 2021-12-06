package com.company;

import java.util.Random;
import java.util.Scanner;

public class Goblins {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public static char move;
    private int health;
    private int strength;
    private int x;
    private int y;


    public static char getMove() {
        return move;
    }

    public static void setMove(char move) {
        Goblins.move = move;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Goblins() {
        this.health = 15;
        this.x = 0;
        this.y = 0;
    }


    public Goblins(int health, int x, int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void movement(Land land) {
        System.out.println("Move Goblins (n/s/e/w): ");
        move = scan.nextLine().toLowerCase().charAt(0);
        try {
            switch (move) {
                case 'n':
                    if (this.y > 0) {
                        this.y--;
                        setY(y);
                    } else {
                        System.out.println("Invalid move");
                        movement(land);
                    }
                    break;
                case 's':
                    if (this.y < land.getSize()) {
                        this.y++;
                        setY(y);
                    } else {
                        System.out.println("Invalid move");
                        movement(land);
                    }
                    break;
                case 'e':
                    if (this.x < land.getSize()) {
                        this.x++;
                        setX(x);
                    } else {
                        System.out.println("Invalid move");
                        movement(land);
                    }
                    break;
                case 'w':
                    if (this.x > 0) {
                        this.x--;
                        setX(x);

                    } else {
                        System.out.println("Invalid move");
                        movement(land);
                    }
                    break;
                default:
                    System.out.println("Invalid Move,please use n,s,e,or w for movement");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input, please use N, S, E, or W for movement");
            movement(land);
        }

    }

}
