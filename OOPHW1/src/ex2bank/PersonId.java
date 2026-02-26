//211765565 daniel rosman

package ex2bank;


public class PersonId {
    // Private fields representing person id , first name , last name and address
    private long id;
    private String firstName;
    private String lastName;
    private String address;

    //Constructor to initialize a PersonId object with given ID, first name, last name, and address.
    public PersonId(long id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and setter methods for private fields
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Equals method to compare two PersonId objects based on their IDs.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonId personId = (PersonId) o;
        return id == personId.id;
    }

    //toString method to return a string representation of the PersonId object.
    @Override
    public String toString() {
        return "PersonId: " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'';
    }
}
