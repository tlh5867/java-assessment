public class User extends Person {
    //- Add a protected property called `isAdmin` that is a boolean.
    protected String isAdmin;
    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
