package chegg;
public class Person {
    
    private String id;
    private String lastName;
    private String firstName;
    
    public Person(String id, String last, String first)
    {
        this.id = id;
        this.lastName = last;
        this.firstName = first;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getId() {
        return id;
    }
    
    public String toString()
    {
        return id + ": " + firstName + " " + lastName;
    }
}