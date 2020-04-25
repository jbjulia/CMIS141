package projects.cmis141.crime;

// Import modules

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jbjulia
 */
public class USCrimeStats {

    // Private variable declaration and initialization
    private static ArrayList<USCrimeClass> csvList;
    private static boolean quit = false;
    private static long startTime = System.currentTimeMillis();

    // Main method
    public static void main(String[] args) throws IOException {
        // Check for valid arguments
        if (args.length == 0 || args.length > 1) {
            System.out.println("Please include a file path for the .csv file you wish to use.");
            System.exit(0);
        } else {
            // Check for valid file path
            try {
                ArrayList<USCrimeClass> crimeList = readFile(args[0]);
            } catch (FileNotFoundException e) {
                // Catches file not found exception.
                System.out.println(e);
                System.exit(0);
            } finally {
                // Run menu
                Menu menu = new Menu();
                menu.printHeader();
                while (!quit) {
                    menu.printMenu();
                    int selection = menu.getSelection();
                    switch (selection) {
                        case 1:
                            menu.clearTerminal();
                            calcPopulationGrowth();
                            break;
                        case 2:
                            menu.clearTerminal();
                            System.out.println(yearWithHighestMurderRate());
                            break;
                        case 3:
                            menu.clearTerminal();
                            System.out.println(yearWithLowestMurderRate());
                            break;
                        case 4:
                            menu.clearTerminal();
                            System.out.println(yearWithHighestRobberyRate());
                            break;
                        case 5:
                            menu.clearTerminal();
                            System.out.println(yearWithLowestRobberyRate());
                            break;
                        case 6:
                            menu.clearTerminal();
                            System.out.println(quitApplication());
                            quit = true;
                            break;
                        default:
                            menu.clearTerminal();
                            System.out.println("The selection you made is not valid, please try again.");
                            System.exit(0);
                            break;
                    }
                }
            }
        }
    }

    // File reader
    static ArrayList<USCrimeClass> readFile(String fileName) throws IOException {
        // Variable declaration and initialization
        csvList = new ArrayList<>();
        String line;
        try {
            // Initialize file reader to read the file
            Scanner fileReader = new Scanner(new FileInputStream(
                    new File(fileName)));
            // Skip column headers
            fileReader.nextLine();
            // Loop until end of file
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                // Add each record to csvList
                USCrimeClass record = new USCrimeClass(line);
                csvList.add(record);
            }
        } catch (FileNotFoundException e) {
            // Catches file not found exception
            System.out.println(e);
            System.exit(0);
        }
        return csvList;
    }

    // Get percentages in population growth for each consecutive year from 1994 – 2013
    static void calcPopulationGrowth() {
        float growth;
        System.out.println("The population growth percentage for each consecutive is listed below: ");
        for (int i = 0; i < csvList.size() - 1; i++) {
            growth = 100 * (float) (csvList.get(i + 1).getPopulation() - csvList.get(i).getPopulation()) / csvList.get(i).getPopulation();
            System.out.println("\t[" + csvList.get(i).getYear() + " - " + csvList.get(i + 1).getYear() + "]: " + String.format("%.4f", growth) + "%");
        }
        System.out.println("");
    }

    // Get year that murder rate was the highest
    static String yearWithHighestMurderRate() {
        int year = -1;
        float currRate = -1;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() > currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        String results = ("\nMurder rate was the highest in " + year + ".\n");
        return results;
    }

    // Get year that murder rate was the lowest
    static String yearWithLowestMurderRate() {
        int year = -1;
        float currRate = 999999;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getMurderRates() < currRate) {
                currRate = csvList.get(i).getMurderRates();
                year = csvList.get(i).getYear();
            }
        }
        String results = ("\nMurder rate was the lowest in " + year + ".\n");
        return results;
    }

    // Get year that robbery rate was the highest
    static String yearWithHighestRobberyRate() {
        int year = -1;
        float currRate = -1;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate() > currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        String results = ("\nRobbery rate was the highest in " + year + ".\n");
        return results;
    }

    // Get year that robbery rate was the lowest
    static String yearWithLowestRobberyRate() {
        int year = -1;
        float currRate = 999999;
        for (int i = 0; i < csvList.size(); i++) {
            if (csvList.get(i).getRobberyRate() < currRate) {
                currRate = csvList.get(i).getRobberyRate();
                year = csvList.get(i).getYear();
            }
        }
        String results = ("\nRobbery rate was the lowest in " + year + ".\n");
        return results;
    }

    // Calculate time elapsed using program and print exit message
    static String quitApplication() {
        long endTime = System.currentTimeMillis();
        long timeElapsed = (endTime - startTime) / 1000;
        String exitMessage = "Thank you for using the US Crimes Statistics Archive. Goodbye.\n"
                + "\nYou spent " + timeElapsed + " second(s) using this program!";
        return exitMessage;
    }
}
