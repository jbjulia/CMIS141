package projects.cmis141.crime;

// Import modules

import java.util.Scanner;

/**
 * @author jbjulia
 */
public class Menu {

    // Print header text
    public void printHeader() {
        clearTerminal();
        System.out.println("Welcome to the US Crime Statistics Archive!");
        System.out.println("\nPlease make a selection from the menu below, or press '6' to quit the program.\n");
    }

    // Print menu options
    public void printMenu() {
        System.out.println("1.) What were the percentages in population growth for each consecutive year from 1994-2013?");
        System.out.println("2.) What year was the Murder rate the highest?");
        System.out.println("3.) What year was the Murder rate the lowest?");
        System.out.println("4.) What year was the Robbery rate the highest?");
        System.out.println("5.) What year was the Robbery rate the lowest?");
        System.out.println("6.) Quit the program\n");
    }

    // Scan for user selection and return selection made
    public int getSelection() {
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        do {
            try {
                System.out.println("Enter your selection: ");
                selection = Integer.parseInt(scan.nextLine());
                // Check for selection outside of menu
                if (selection < 1 || selection > 6) {
                    System.out.println("The selection you made is not valid, please try again.\n");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid selection.\n");
            }
        } while (selection < 1 || selection > 6);
        return selection;
    }

    // Flushes terminal to clear screen for output
    public void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
