//written by daniel rosman 211765565
package assignment_1_enums.colors;

// Class representing a palette of colors
public class ColorPalette {

    // Array to hold the colors in the palette
    private Color []colors;

    // Constructor to initialize the color palette with an array of colors
    public ColorPalette(Color[] colors) {
        this.colors = colors;
    }

    // Method to retrieve a color from the palette by its name
    public Color getColorByName(String name) {
        for (Color color : colors) {
            if (color.getName().equalsIgnoreCase(name)) {
                return color;
            }
        }
        return null;
    }
}
