import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x=0;
        System.out.println("Which cave will you go into?");
        try {
            x = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        System.out.println(result(x));
    }

    public static String result(int x) {
        if (x == 1) {
            return ("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out it front of you!He opened  his jaws and ...\n" +
                    "Goobles you down in one bite!\n");
        }
        if (x == 2) {
            return ("Take my treasure");
        }
        return "Invalid number,please enter 1 or 2";
    }
}


