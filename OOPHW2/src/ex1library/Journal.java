//written by daniel rosman 211765565

package ex1library;

/**
 * Represents a journal extending from a general publication.
 * Contains details about the journal's sheet number and year of publication.
 */
public class Journal extends Publication {
    /**
     * Attributes
     */

    private int sheetNumber;
    private int yearOfPublication;

    /**
     * Constructs a Journal object with specified attributes.
     *
     * @param title             Title of the journal.
     * @param publication       Name of the publication where the journal is published.
     * @param quantity          Quantity of the journal.
     * @param sheetNumber       Number of sheets in the journal.
     * @param yearOfPublication Year of publication of the journal.
     */
    public Journal(String title, String publication, int quantity, int sheetNumber, int yearOfPublication) {
        super(title, publication, quantity);
        this.sheetNumber = sheetNumber;
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * getters & setters
     */
    public int getSheetNumber() {
        return sheetNumber;
    }

    public void setSheetNumber(int sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * Returns a string representation of the journal.
     *
     * @return String representation of the journal.
     */
    @Override
    public String toString() {
        return getSerialNumber() + "-" + getKindOfPublication() + "  " + getTitle() + "(" + getSheetNumber() + ")" + " published by " + getPublication() + "(" + getYearOfPublication() + ")";

    }
}
