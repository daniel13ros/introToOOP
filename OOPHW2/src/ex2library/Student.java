//written by daniel rosman 211765565

package ex2library;

import ex1library.Publication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Student class represents a student who can borrow publications from a library.
 * Each student has a name, a unique student number, and a list of borrowed publications.
 */
public class Student {
    /**
     * Attributesa
     */
    private String studentName;
    private final int StudentNumber;
    private static int counter = 0;

    private List<Publication> publicationsBorrowed = new ArrayList<>(3);
    private int loanedNum = 0;

    /**
     * Constructs a new Student with the specified name.
     * Assigns a unique student number to each student.
     *
     * @param studentName the name of the student
     */
    public Student(String studentName) {
        this.studentName = studentName;
        StudentNumber = counter++;
        this.publicationsBorrowed = publicationsBorrowed;
        loanedNum = 0;
    }

    /**
     * getters & setters
     */
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public List<Publication> getPublicationsBorrowed() {
        return publicationsBorrowed;
    }

    public void setPublicationsBorrowed(List<Publication> publicationsBorrowed) {
        this.publicationsBorrowed = publicationsBorrowed;
    }

    public int getLoanedNum() {
        return loanedNum;
    }

    public void setLoanedNum(int loanedNum) {
        loanedNum = loanedNum;
    }

    /**
     * Checks if the student can borrow more publications.
     *
     * @return true if the student can borrow more publications, false otherwise
     */
    public boolean canLoan() {
        return publicationsBorrowed.size() < 3;
    }

    /**
     * Adds a publication to the student's list of borrowed publications.
     *
     * @param publication the publication to be borrowed
     */
    public void loanPublication(Publication publication) {
        publicationsBorrowed.add(publication);
        loanedNum++;
    }

    // Override toString method to return a string representation of the student
    @Override
    public String toString() {
        return "Student number:" + getStudentNumber() + "  name:'" + studentName + '\'' + ", loaned-publications: "
                + loanedNum +"\n" +"List of the current publications borrowed: \n"+publicationsBorrowed.stream().toArray();
    }
}
