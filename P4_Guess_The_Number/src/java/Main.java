import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        guessPlay(getName());
    }

    public static String getName() {
        System.out.println("Hello!What is your name?");
        return scan.nextLine();
    }

    public static int getGuess() {
        int guess = -1;
        System.out.println("Take a guess.");
        try {
            guess = scan.nextInt();
        } catch (Exception e) {
            System.out.println("invalid number");
        }
        return guess;
    }


    public static boolean guess(int number, String name, int count, int guess) {
        if (number > guess) {
            System.out.println("Your guess is too low");
            return false;
        } else if (number < guess) {
            System.out.println("Your guess is too high");
            return false;
        }
        System.out.println("Good job," + name + "!" + "You guessed my number in " + count + " guesses!"
                + "Would you like to play again? (y or n)");
        return true;
    }

    public static void guessPlay(String name) {
        Random ran = new Random();
        int guess;
        int number = ran.nextInt(21);
        boolean win = false;
        int count = 0;
        String yes ="";

        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.\n" +
                "\n");

        while(!win){
            guess = getGuess();
            win = guess(number, name, count + 1, guess);
            count++;
        }
        System.out.println(("Would you like to play again(y/n)"));
        yes+= scan.nextLine();

        if(yes == "y"){
            guessPlay(name);
        }
        }
}
