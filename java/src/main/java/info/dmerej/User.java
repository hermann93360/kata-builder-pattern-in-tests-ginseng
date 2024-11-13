package info.dmerej;


import lombok.Builder;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Builder(setterPrefix = "with", toBuilder = true)
public record User(String name, String email, int age, boolean verified, Address addres) {

    public User.UserBuilder but() {
        return this.toBuilder();
    }
}
