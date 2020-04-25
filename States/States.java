package projects.cmis141.states;

// Import modules

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jbjulia
 */
public class States {

    // Main method
    public static void main(String[] args) {

        // Initialize stateInfo array
        String[][] stateInfo = {
                {
                        "alabama",
                        "Bird: Yellowhammer",
                        "Flower: Camellia"
                },
                {
                        "alaska",
                        "Bird: Willow Ptarmigan",
                        "Flower: Forget-me-not"
                },
                {
                        "arizona",
                        "Bird: Cactus Wren",
                        "Flower: Saguaro Cactus Blossom"
                },
                {
                        "arkansas",
                        "Bird: Northern Mockingbird",
                        "Flower: Apple Blossom"
                },
                {
                        "california",
                        "Bird: California Quail",
                        "Flower: California Poppy"
                },
                {
                        "colorado",
                        "Bird: Lark Bunting",
                        "Flower: Rocky Mountain Columbine"
                },
                {
                        "connecticut",
                        "Bird: American Robin",
                        "Flower: Mountain Laurel"
                },
                {
                        "delaware",
                        "Bird: Delaware Blue Hen",
                        "Flower: Peach Blossom"
                },
                {
                        "florida",
                        "Bird: Northern Mockingbird",
                        "Flower: Orange Blossom"
                },
                {
                        "georgia",
                        "Bird: Brown Thrasher",
                        "Flower: Cherokee Rose"
                },
                {
                        "hawaii",
                        "Bird: Hawaiian Goose",
                        "Flower: Hawaiian Hibiscus"
                },
                {
                        "idaho",
                        "Bird: Mountain Bluebird",
                        "Flower: Syringa (Mock Orange)"
                },
                {
                        "illinois",
                        "Bird: Northern Cardinal",
                        "Flower: Violet"
                },
                {
                        "indiana",
                        "Bird: Northern Cardinal",
                        "Flower: Peony"
                },
                {
                        "iowa",
                        "Bird: Eastern Goldfinch (a/k/a American Goldfinch)",
                        "Flower: Wild Prairie Rose"
                },
                {
                        "kansas",
                        "Bird: Wester Meadowlark",
                        "Flower: Sunflower"
                },
                {
                        "kentucky",
                        "Bird: Northern Cardinal",
                        "Flower: Goldenrod"
                },
                {
                        "louisiana",
                        "Bird: Brown Pelican",
                        "Flower: Magnolia"
                },
                {
                        "maine",
                        "Bird: Chickadee",
                        "Flower: White Pine Cone and Tassel"
                },
                {
                        "maryland",
                        "Bird: Baltimore Oriole",
                        "Flower: Black-eyed Susan"
                },
                {
                        "massachusetts",
                        "Bird: Black-capped Chickadee",
                        "Flower: Mayflower"
                },
                {
                        "michigan",
                        "Bird: American Robin",
                        "Flower: Apple Blossom"
                },
                {
                        "minnesota",
                        "Bird: Common Loon",
                        "Flower: Pink and White Lady's Slipper"
                },
                {
                        "mississippi",
                        "Bird: Mosquito... just kidding... Northern Mockingbird",
                        "Flower: Magnolia"
                },
                {
                        "missouri",
                        "Bird: Eastern Bluebird",
                        "Flower: Hawthorn"
                },
                {
                        "montana",
                        "Bird: Western Meadowlark",
                        "Flower: Bitterroot"
                },
                {
                        "nebraska",
                        "Bird: Western Meadowlark",
                        "Flower: Goldenrod"
                },
                {
                        "nevada",
                        "Bird: Mountain Bluebird",
                        "Flower: Sagebrush"
                },
                {
                        "new hampshire",
                        "Bird: Purple Finch",
                        "Flower: Purple Lilac"
                },
                {
                        "new jersey",
                        "Bird: Eastern Goldfinch (a/k/a American Goldfinch)",
                        "Flower: Violet"
                },
                {
                        "new mexico",
                        "Bird: Roadrunner (a/k/a Greater Roadrunner",
                        "Flower: Yucca Flower"
                },
                {
                        "new york",
                        "Bird: Eastern Bluebird",
                        "Flower: Rose"
                },
                {
                        "north carolina",
                        "Bird: Northern Cardinal",
                        "Flower: Flowering Dogwood"
                },
                {
                        "north dakota",
                        "Bird: Western Meadowlark",
                        "Flower: Wild Prairie Rose"
                },
                {
                        "ohio",
                        "Bird: Northern Cardinal",
                        "Flower: Scarlet Carnation"
                },
                {
                        "oklahoma",
                        "Bird: Scissor-tailed Flycatcher",
                        "Flower: Oklahoma Rose"
                },
                {
                        "oregon",
                        "Bird: Western Meadowlark",
                        "Flower: Oregon Grape"
                },
                {
                        "pennsylvania",
                        "Bird: Ruffed Grouse",
                        "Flower: Mountain Laurel"
                },
                {
                        "rhode island",
                        "Bird: Rhode Island Red",
                        "Flower: Violet"
                },
                {
                        "south carolina",
                        "Bird: Carolina Wren (formerly Northern Mockingbird)",
                        "Flower: Yellow Jessamine"
                },
                {
                        "south dakota",
                        "Bird: Ring-necked Pheasant",
                        "Flower: Pasque Flower"
                },
                {
                        "tennessee",
                        "Bird: Northern Mockingbird",
                        "Flower: Iris"
                },
                {
                        "texas",
                        "Bird: Northern Mockingbird",
                        "Flower: Bluebonnet"
                },
                {
                        "utah",
                        "Bird: California Gull",
                        "Flower: Sego Lilly"
                },
                {
                        "vermont",
                        "Bird: Hermit Thrush",
                        "Flower: Red Clover"
                },
                {
                        "virginia",
                        "Bird: Northern Cardinal",
                        "Flower: American Dogwood"
                },
                {
                        "washington",
                        "Bird: Willow Goldfinch (a/k/a American Goldfinch)",
                        "Flower: Coast Rhododendron"
                },
                {
                        "west virginia",
                        "Bird: Northern Cardinal",
                        "Flower: Rhododendron"
                },
                {
                        "wisconsin",
                        "Bird: American Robin",
                        "Flower: Wood Violet"
                },
                {
                        "wyoming",
                        "Bird: Western Meadowlark",
                        "Flower: Indian Paintbrush"
                },};

        // Initialize empty arrays
        ArrayList<String> states = new ArrayList<>(Arrays.asList());
        ArrayList<String> summary = new ArrayList<>(Arrays.asList());

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Check for command line args
        if (args.length == 0) {
            do { // Loop until users enters 'none'
                System.out.println("\nPlease enter the name of a state you wish to query, or enter 'none' to quit: ");
                String state = scanner.nextLine();
                state = state.trim();
                state = state.toLowerCase();
                //state = Character.toUpperCase(state.charAt(0)) + state.substring(1);
                states.add(state);
                // Clean input and add to array, then print info
                for (int i = 0; i < stateInfo.length; i++) {
                    for (int j = 0; j < stateInfo[0].length; j++) {
                        if (stateInfo[i][j].equals(state)) {
                            //System.out.println("Found it!");
                            printArray(stateInfo, i);
                            summary.add(stateInfo[i][j]);
                        } else {
                            //System.out.println("Not found.");
                        }
                    }
                }
            } while (!states.contains("none")); // End Loop
        } else {
            // Clean input and add to array, then print info
            for (int x = 0; x < args.length; x++) {
                args[x] = args[x].trim();
                args[x] = args[x].toLowerCase();
                //args[x] = Character.toUpperCase(args[x].charAt(0)) + args[x].substring(1);
                states.add(args[x]);
                for (int i = 0; i < stateInfo.length; i++) {
                    for (int j = 0; j < stateInfo[0].length; j++) {
                        if (stateInfo[i][j].equals(args[x])) {
                            //System.out.println("Found it!");
                            printArray(stateInfo, i);
                            summary.add(stateInfo[i][j]);
                        } else {
                            //System.out.println("Not found.");
                        }
                    }
                }
            }
        }

        // Checks for empty summary array, exits if true
        if (summary.isEmpty()) {
            System.exit(0);
        } else {
            // Prints summary of queries
            System.out.println("\nSee your summary of queries below: \n");
            for (String state : summary) {
                for (int i = 0; i < stateInfo.length; i++) {
                    for (int j = 0; j < stateInfo[0].length; j++) {
                        if (stateInfo[i][j].equals(state)) {
                            //stateInfo[i][j] = Character.toUpperCase(stateInfo[i][j].charAt(0)) + stateInfo[i][j].substring(1);
                            printSummary(stateInfo, i);
                            System.out.println("");
                        } else {
                            //System.out.println("Not found.");
                        }
                    }
                }
            }
        }
    }

    public static void printArray(String[][] array, int row) {
        for (int i = 0; i < array[0].length; i++) {
            // Capitalize first letter of state name
            array[row][i] = Character.toUpperCase(array[row][i].charAt(0)) + array[row][i].substring(1);
            // Print state name and info
            System.out.println(array[row][i] + " ");
        }
    }

    public static void printSummary(String[][] array, int row) {
        for (int i = 0; i < array[0].length; i++) {
            // Capitalize first letter of state name
            array[row][i] = Character.toUpperCase(array[row][i].charAt(0)) + array[row][i].substring(1);
            // Print state name and info
            System.out.println(array[row][i] + " ");
        }
    }
}
