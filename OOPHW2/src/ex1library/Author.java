//written by daniel rosman 211765565
package ex1library;

import java.util.Objects;

/**
 * Represents an author with a name and email address.
 */
public class Author {

    /**
     * Attributes
     */
    private String name;
    private String mail;

    /**
     * Constructs an Author object with specified name and email.
     *
     * @param name The name of the author.
     * @param mail The email address of the author.
     */
    public Author(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    /**
     * getters & setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Compares this author with another object for equality.
     *
     * @param o The object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(mail, author.mail);
    }

    /**
     * Generates a hash code for the author object.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, mail);
    }

    /**
     * Returns a string representation of the author object.
     *
     * @return String representation of the author object.
     */
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
