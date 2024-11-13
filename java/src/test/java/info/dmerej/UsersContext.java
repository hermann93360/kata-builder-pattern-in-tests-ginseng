package info.dmerej;

public class UsersContext {

    public static final Address fsfAddress = new Address(
            "51 Franklin Street",
            "Fifth Floor",
            "Boston",
            "02110",
            "USA"
    );

    public static final Address parisAddress = new Address(
            "33 quai d'Orsay",
            "",
            "Paris",
            "75007",
            "France"
    );

    public static User defaultUser() {
        return new User("Bob", "bob@domain.tld", 20, true, fsfAddress);
    }
}
