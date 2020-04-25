package discussions.cmis141.pringles;

// Import modules

import java.util.Scanner;

/**
 * @author jbjulia
 */
public class EatPringles {

    public static void main(String[] args) {
        int userInput = 0;

        Pringles pringles = new Pringles(50);

        System.out.println("How many Pringles do you wish to eat?");

        Scanner scan = new Scanner(System.in);

        try {
            userInput = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, please try again.");
            System.exit(0);
        }

        BBQ snack = new BBQ(50, userInput);

        System.out.print(snack.toString());
    }
}
