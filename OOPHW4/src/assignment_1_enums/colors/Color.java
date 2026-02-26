//written by daniel rosman 211765565
package assignment_1_enums.colors;

// Enum representing basic colors with their RGB values
public enum Color {
    RED (255, 0, 0),
    GREEN (0, 255, 0),
    BLUE (0, 0, 255),
    WHITE (255, 255, 255),
    BLACK (0, 0, 0);

    // Instance variables to store the RGB values
    private final int red;
    private final int green;
    private final int blue;

    // Constructor to initialize the RGB values
    Color(int red, int green, int blue) {
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    //Getters
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getName() {
        return this.name();
    }


}
