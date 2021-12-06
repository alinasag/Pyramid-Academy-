package com.company;

import java.util.ArrayList;

public class Land {
    char landArea = '\u26F6';
    private ArrayList<Goblins> goblins;
    private Humans human;
    private int size;


    public int getSize() {
        return size;
    }


    public Land() {
        this.size = 5;
        this.human = new Humans();
        this.goblins.add(new Goblins(30, this.size, this.size));
    }

    public Land(int size, Humans human, ArrayList<Goblins> goblins) {
        this.size = size;
        this.human = human;
        this.goblins = goblins;

    }

    public String createGrid() {

        String humanChar = " \uD83E\uDDCD ";
        String goblinChar = " \uD83D\uDC7A ";
        String landChar = "  \uD83C\uDD90  ";
        String locationChar = "";
        String res = "";

        for (int x = 0; x < this.size; x++) {
            for (int y = 0; y < this.size; y++) {
                locationChar = landChar;
                    if (human.getX() == x && human.getY() == y) {
                        locationChar = humanChar;
                    }
                for (Goblins goblins : goblins) {
                    if (goblins.getX() == x && goblins.getY() == y) {
                        locationChar = goblinChar;
                    }
                }
                res += locationChar;
            }
            res += " \n  ";
        }
        return res;
    }

    public int combat() {
        int n = (int) (10.0 * Math.random());
        return n;
    }


}
