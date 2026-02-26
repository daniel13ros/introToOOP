
//written by daniel rosman 211765565
package ex1library;

/**
 * Represents a book extending from a general publication.
 * Contains details about the book's author, editor, and year of publication.
 */
public class Book extends Publication {

    /**
     * Attributes
     */
    private Author author;
    private String editor;
    private int yearOfPublication;

    /**
     * Constructs a Book object with specified attributes.
     *
     * @param title             Title of the book.
     * @param publication       Name of the publication where the book is published.
     * @param quantity          Quantity of the book.
     * @param author            Author of the book.
     * @param editor            Editor of the book.
     * @param yearOfPublication Year of publication of the book.
     */
    public Book(String title, String publication, int quantity, Author author, String editor, int yearOfPublication) {
        super(title, publication, quantity);
        this.author = author;
        this.editor = editor;
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * getters & setters
     */
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return String representation of the book.
     */
    @Override
    public String toString() {
        return getSerialNumber() + "-" + getKindOfPublication() + "  '" + getTitle() + "'" + " by " + getPublication() + " at " + getAuthor().getMail() + " published by " + getAuthor().getName() + " edited by " + getEditor() + "(" + getYearOfPublication() + ")";
    }
}
