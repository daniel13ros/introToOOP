//written by daniel rosman 211765565
package ex1library;

/**
 * Represents an article extending from a journal publication.
 * Contains details about the article's name, author, URL, and inherits publication information.
 */
public class Article extends Journal {

    /**
     * Attributes
     */
    private String articleName;
    private Author author;
    private String URL;

    /**
     * Constructs an Article object with specified attributes.
     *
     * @param title             Title of the journal.
     * @param publication       Name of the publication.
     * @param quantity          Quantity of the journal.
     * @param sheetNumber       Number of sheets in the journal.
     * @param yearOfPublication Year of publication of the journal.
     * @param articleName       Name of the article.
     * @param author            Author of the article.
     * @param URL               URL of the article.
     */
    public Article(String title, String publication, int quantity, int sheetNumber, int yearOfPublication, String articleName, Author author, String URL) {
        super(title, publication, quantity, sheetNumber, yearOfPublication);
        this.articleName = articleName;
        this.author = author;
        this.URL = URL;
    }

    /**
     * getters & setters
     */
    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Returns a string representation of the article.
     *
     * @return String representation of the article.
     */
    @Override
    public String toString() {
        return getSerialNumber() + "-" + getKindOfPublication() + "  '" + getArticleName() + "' by " + getAuthor().getName() + " at " + getAuthor().getMail() + " " + getTitle() + " (" + getSheetNumber() + ") published by " + getPublication() + "(" + getYearOfPublication() + ")";

    }
}
