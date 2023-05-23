public class User extends AbstractEntity {

    private final String email;
    private final String userData;

    public User(String email, String userData) {
        this.email = email;
        this.userData = userData;
    }

    @Override
    public Object getObject() {
        return new User(email, userData);
    }

    @Override
    public boolean processValidation() {
        System.out.println("User Validation process started: ");
        System.out.println("User email validated: " + email );
        return true;
    }

    @Override
    public boolean saveInformationRequest(String information) {
        if (information.contains("@")) {
            System.out.println("You cannot change user email!");
            return false;
        } else {
            User updatedUser = new User(email, information);
            System.out.println("User information updated: " + updatedUser.toString());
            return true;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userData='" + userData + '\'' +
                '}';
    }

}
