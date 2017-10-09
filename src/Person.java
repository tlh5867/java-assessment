public class Person {
    //Add `firstName` and `lastName` as protected properties.
    protected String firstName;
    protected String lastName;
    //Add a constructor method that takes in two strings that are `firstName` and `lastName`.


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   // Write a getter and setter for the `firstName` property as well as a getter and setter for `lastName`.
    //- If the `firstName` or `lastName` inputs are `null`, be sure to throw an `IllegalArgumentException` inside of the constructor.


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
}
