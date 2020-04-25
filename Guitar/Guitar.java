package projects.cmis141.guitar;

// Import modules

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author jbjulia
 */
public class Guitar {

    private final String NOTES = "ABCDEFG";
    private final int N = NOTES.length();
    private final List<String> DURATION = Arrays.asList(".25", ".5", "1", "2", "4");
    // Variable declaration and initialization
    private int numStrings;
    private double guitarLength;
    private String guitarManufacturer;
    private Color guitarColor;
    private int randIndex = 0;
    private String value = "";
    private String playGuitar = "";
    private Random rand = new Random();

    // Default constructor
    public Guitar() {
        numStrings = 6;
        guitarLength = 28.2;
        guitarManufacturer = "Gibson";
        guitarColor = Color.RED;
    }

    // Specified constructor
    public Guitar(int strings, double length, String manufacturer, Color color) {
        numStrings = strings;
        guitarLength = length;
        guitarManufacturer = manufacturer;
        guitarColor = color;

    }

    // Get number of strings
    public int getStrings() {
        return numStrings;
    }

    // Get length of guitar
    public double getGuitarLength() {
        return guitarLength;
    }

    // Get guitar manufacturer
    public String getManufacturer() {
        return guitarManufacturer;
    }

    // Get color of guitar
    public String getColor() {
        // Converts Color to String
        if (guitarColor.equals(Color.BLACK)) {
            return "Black";
        } else if (guitarColor.equals(Color.WHITE)) {
            return "White";
        } else if (guitarColor.equals(Color.BLUE)) {
            return "Blue";
        } else if (guitarColor.equals(Color.RED)) {
            return "Red";
        } else {
            return "Can't identify color.";
        }
    }

    // Display guitar guitar information as String
    @Override
    public String toString() {
        String strGuitarInfo = "\nNumber of Strings: " + numStrings
                + "\nLength of Guitar: " + guitarLength
                + "\nGuitar Manufacturer: " + guitarManufacturer
                + "\nColor of Guitar: " + getColor();
        return strGuitarInfo;
    }

    // Display 16 randomly selected musical notes of random duration
    public String playGuitar() {
        // For loop to select 16 random notes
        for (int i = 0; i < 16; i++) {
            // Variable declaration and initialization
            char note = NOTES.charAt(rand.nextInt(N));
            randIndex = rand.nextInt(DURATION.size());
            value = DURATION.get(randIndex);
            // String construction
            if (i == 15) {
                playGuitar = playGuitar + "[" + note + "(" + value + ")" + "]";
                break;
            }
            playGuitar = playGuitar + "[" + note + "(" + value + ")" + "], ";
        }
        return playGuitar;
    }
}
