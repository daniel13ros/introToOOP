//written by daniel rosman 211765565
package ex2library;
import ex1library.*;

import java.util.*;

public class MainStudents {
    public static void main(String[] args) throws Exception {
        // Create an array of students and initialize them
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        // List all students
        listStudents(students);
        System.out.println("\n***************************************\n");
        // Run the library simulation
        runLibrarySimulation();
    }
    /**
     * Lists all students in the order they were entered.
     *
     * @param students an array of students
     */
    public static void listStudents(Student[] students) {
        System.out.println("\n");
        System.out.println("List of students in the order they were entered:");
        System.out.println("=======================================================");
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else break;
        }
    }

    public static void listStudents(List<Student> students) {
        System.out.println("\n");
        System.out.println("List of students in the order they were entered:");
        System.out.println("=======================================================");
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else break;
        }
    }
    /**
     * Runs the library simulation where students can borrow publications.
     *
     */
    public static void runLibrarySimulation()   {
        // Create an array of authors and initialize them
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        // Create a list of publications and initialize them
        List<Publication> publications = new ArrayList<>(Arrays.asList(
                new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.", 2, authors[0], "Tay Hohoff", 1960),
                new Journal("Scientific American", "Springer Nature", 5, 135, 2021),
                new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1),
                new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3),
                new Book("The Great Gatsby", "Charles Scribner's Sons", 1, authors[1], "Maxwell Perkins", 1925),
                new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020),
                new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30),
                new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt", 1, authors[2], "", 2002),
                new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2),
                new Journal("Nature", "Springer Nature", 5, 590, 2021)
        ));

        // Create a list of students and initialize them
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Albert Einstein"),
                new Student("Marie Curie"),
                new Student("Rosalind Franklin"),
                new Student("Stephen Hawking")
        ));


        Scanner scanner = new Scanner(System.in);

        // Loop for library simulation
        while (true) {
            System.out.println("Welcome to the library. Start loan:");
            System.out.print("Insert student number [0,3]: ");
            int studentIndex = scanner.nextInt();
            System.out.print("Insert publication number [10,19]: \n");
            int publicationNumber = scanner.nextInt();

            // Check for valid student index
            if (studentIndex < 0 || studentIndex >= students.size()) {
                System.out.println("Invalid student number.");
                continue;
            }

            // Check for valid publication number
            if (publicationNumber < 10 || publicationNumber >= 10 + publications.size()) {
                System.out.println("Invalid publication number.");
                continue;
            }

            Student student = students.get(studentIndex);
            Publication publication = publications.get(publicationNumber - 10);

            // Check if student can loan and publication is available
            if (student.canLoan() && publication.getQuantity() > 0) {
                student.loanPublication(publication);
                publication.decrementQty();
                System.out.println("Successful loan of:");
                System.out.println(publication);
            } else {
                if (!student.canLoan()) {
                    System.out.println("Loan failed - student has already loaned 3 publications.");
                } else {
                    System.out.println("Loan failed - out of stock.");
                }
            }

            // Print loan report
            System.out.println("\nLoan Report:");
            System.out.println("Student number: " + studentIndex + " name: " + student.getStudentName() + " loaned-publications: " + student.getPublicationsBorrowed().size());
            System.out.println("\nList of loaned publications:");
            for (Publication pub : student.getPublicationsBorrowed()) {
                System.out.println(pub);
            }

            // Check if user wants to continue
            System.out.print("\nWould you like to continue? (yes/no): ");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (!(Objects.equals(response, "yes"))) {
                break;
            }
        }

        // Print final state of publications
        System.out.println("\nFinal state of publications:");
        System.out.println("Report on library status:");
        System.out.println("============================\n");
        for (Publication pub : publications) {
            System.out.println(pub.getSerialNumber() + "-" + pub.getKindOfPublication() + " qty:" + pub.getQuantity() + " " + pub.getTitle());
        }

        scanner.close();
    }


}
