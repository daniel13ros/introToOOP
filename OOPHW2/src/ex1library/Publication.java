//written by daniel rosman 211765565

package ex1library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Base class representing a generic publication.
 * Serves as the parent class for specific types of publications such as Book, Journal, Encyclopedia, and Article.
 * Includes attributes for title, publication name, quantity, and a unique serial number.
 * Provides methods to access and modify these attributes, and a static method to sort an array of publications.
 */
public class Publication {

    /**
     * Attributes
     */
    private String title;
    private String publication;
    private int quantity;
    private final int serialNumber;
    private static int counter = 10;

    /**
     * Constructs a new Publication with the specified title, publication name, and quantity.
     * Assigns a unique serial number to each publication.
     *
     * @param title       the title of the publication
     * @param publication the name of the publication
     * @param quantity    the quantity of the publication available
     */
    public Publication(String title, String publication, int quantity) {
        this.title = title;
        this.publication = publication;
        this.quantity = quantity;
        this.serialNumber = counter++;
    }

    /**
     * getters & setters
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return '\'' + publication + '\'';
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    // Decrements the quantity by 1 if it's greater than 0
    public void decrementQty() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }

    /**
     * Determines the kind of publication based on the class name.
     *
     * @return a string representing the kind of publication
     */
    public String getKindOfPublication() {
        if (this.getClass().getName().equals("ex1library.Book"))
            return "book";
        if (this.getClass().getName().equals("ex1library.Journal"))
            return "Jrnl";
        if (this.getClass().getName().equals("ex1library.Encyclopedia"))
            return "Ency";
        if (this.getClass().getName().equals("ex1library.Article"))
            return "Artl";
        return "";
    }

    // Override equals and hashCode methods to compare publications based on their attributes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return quantity == that.quantity && serialNumber == that.serialNumber && Objects.equals(title, that.title) && Objects.equals(publication, that.publication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publication, quantity, serialNumber);
    }

    /**
     * Sorts an array of Publication objects by their type in the order: Book, Journal, Article, Encyclopedia.
     *
     * @param publicationsBefore the array of publications to be sorted
     */
    public static void sorted(Publication[] publicationsBefore) {

        Arrays.sort(publicationsBefore, new Comparator<Publication>() {
            @Override
            public int compare(Publication p1, Publication p2) {
                return getOrder(p1) - getOrder(p2);
            }

            private int getOrder(Publication p) {
                if (p instanceof Encyclopedia) {
                    return 4;
                } else if (p instanceof Article) {
                    return 3;
                } else if (p instanceof Journal) {
                    return 2;
                } else if (p instanceof Book) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("\n");
        System.out.println("List of publication sorted by 'Book', 'Journal', 'Article', 'Encyclopedia' :");
        System.out.println("=======================================================");
        for (Publication p : publicationsBefore) {
            if (p != null) {
                System.out.println(p);
            }
        }

    }


    // Override toString method to return a string representation of the publication

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", publication='" + publication + '\'' +
                ", quantity=" + quantity +
                ", serialNumber=" + serialNumber +
                '}';
    }

}
