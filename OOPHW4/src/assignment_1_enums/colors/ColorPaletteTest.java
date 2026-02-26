//written by daniel rosman 211765565
package assignment_1_enums.colors;

// Test class for the ColorPalette class
public class ColorPaletteTest {
    public static void main(String[] args) {

        // Get all colors defined in the Color enum
        Color []colors=Color.values();

        // Create a ColorPalette instance using the array of colors
        ColorPalette colorPalette=new ColorPalette(colors);

        // Iterate through each color in the colors array
        for (Color color:colors){

            // Use the getColorByName method to find the color in the palette by name
            Color baseColor=colorPalette.getColorByName(color.getName());
            // Check if the color was found in the palette
            if (baseColor!=null){
                System.out.println("Color found: " + baseColor.getName() + " (Red: " + baseColor.getRed() + ", Green: " + baseColor.getGreen() + ", Blue: " + baseColor.getBlue() + ")");
            }else {
                System.out.println("Color not found:"+color.getName());
            }

        }
    }
}
