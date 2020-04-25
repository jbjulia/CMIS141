package projects.cmis141.guitar;

// Import modules

import java.awt.*;

/**
 * @author jbjulia
 */
public class TestGuitar {

    public static void main(String[] args) {

        // Variable declaration
        int guitarStrings;
        double guitarLength;
        String guitarManufacturer;
        String guitarColor;

        // Contructors
        Guitar g1 = new Guitar(6, 25.1, "Ibanez", Color.BLACK);
        Guitar g2 = new Guitar(4, 26.5, "Fender", Color.WHITE);
        Guitar g3 = new Guitar(12, 29.2, "Yamaha", Color.RED);

        // Getters for g1
        guitarStrings = g1.getStrings();
        guitarLength = g1.getGuitarLength();
        guitarManufacturer = g1.getManufacturer();
        guitarColor = g1.getColor();

        // Display the values using toString
        System.out.println("toString(): " + g1.toString());

        // Print results of getter methods
        System.out.println("getStrings(): " + guitarStrings);
        System.out.println("getGuitarLength(): " + guitarLength);
        System.out.println("getManufacturer(): " + guitarManufacturer);
        System.out.println("getColor(): " + guitarColor);

        // Print playGuitar methods
        System.out.println("playGuitar(): " + g1.playGuitar());

        // Spacing
        System.out.println();

        // Getters for g2
        guitarStrings = g2.getStrings();
        guitarLength = g2.getGuitarLength();
        guitarManufacturer = g2.getManufacturer();
        guitarColor = g2.getColor();

        // Display the values using toString
        System.out.println("toString(): " + g2.toString());

        // Print results of getter methods
        System.out.println("getStrings(): " + guitarStrings);
        System.out.println("getGuitarLength(): " + guitarLength);
        System.out.println("getManufacturer(): " + guitarManufacturer);
        System.out.println("getColor(): " + guitarColor);

        // Print playGuitar methods
        System.out.println("playGuitar(): " + g2.playGuitar());

        // Spacing
        System.out.println();

        // Getters for g3
        guitarStrings = g3.getStrings();
        guitarLength = g3.getGuitarLength();
        guitarManufacturer = g3.getManufacturer();
        guitarColor = g3.getColor();

        // Display the values using toString
        System.out.println("toString(): " + g3.toString());

        // Print results of getter methods
        System.out.println("getStrings(): " + guitarStrings);
        System.out.println("getGuitarLength(): " + guitarLength);
        System.out.println("getManufacturer(): " + guitarManufacturer);
        System.out.println("getColor(): " + guitarColor);
        System.out.println();

        // Print playGuitar methods
        System.out.println("Anyway, here's Wonderwall!\n\n");
        System.out.println("playGuitar(): " + g3.playGuitar());
    }
}
