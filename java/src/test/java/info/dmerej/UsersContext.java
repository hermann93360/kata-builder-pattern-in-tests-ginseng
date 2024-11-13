package info.dmerej;

public class UsersContext {

    private static final Address fsfAddress = new Address(
            "51 Franklin Street",
            "Fifth Floor",
            "Boston",
            "02110",
            "USA"
    );

    private static final Address parisAddress = new Address(
            "33 quai d'Orsay",
            "",
            "Paris",
            "75007",
            "France"
    );

    public static User localUserMinorAndVerified() {
        return new User("Bob", "bob@domain.tld", 16, true, fsfAddress);
    }

    public static User localUserMajorAndVerified() {
        return new User("Bob", "bob@domain.tld", 20, true, fsfAddress);
    }

    public static User foreignUser() {
        return new User("Bob", "bob@domain.tld", 20, false, parisAddress);
    }
}
