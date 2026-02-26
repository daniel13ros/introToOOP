//written by daniel rosman 211765565
package assignment_3_carAgency;

// Enum representing different options available in the car agency system menu
public enum Option {
    SHOW_EMPLOYEES("list of employees"),
    SHOW_UNSOLD_CARS("list of cars available"),
    SELL_CAR("sell car"),
    ADD_CAR("add car"),
    EXIT("end program");

    // Description of the menu option
    private final String description;

    // Constructor to initialize the description of the option
    Option(String description) {
        this.description=description;
    }

    //Getter
    public String getDescription() {
        return description;
    }

    // Static method to get an Option instance based on its ordinal value
    public static Option fromOrdinal(int ordinal) {
        for (Option option : values()) {
            if (option.ordinal() == ordinal) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid menu option: " + ordinal);
    }
}
