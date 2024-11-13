package info.dmerej;

import org.junit.jupiter.api.Test;

import static info.dmerej.UsersContext.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {

    @Test
    public void happy_path() {
        final User user = defaultUser();

        assertTrue(Shop.canOrder(user));
        assertFalse(Shop.mustPayForeignFee(user));
    }

    @Test
    public void minors_cannot_order_from_shop() {
        final User user = defaultUser().but()
                .withAge(17)
                .withVerified(true)
                .build();

        assertFalse(Shop.canOrder(user));
    }

    @Test
    public void must_be_verified_to_order_from_shop() {
        final User user = defaultUser().but()
                .withAge(20)
                .withVerified(true)
                .build();

        assertTrue(Shop.canOrder(user));
    }

    @Test
    public void foreigners_must_pay_foreign_fee() {
        final User user = defaultUser().but()
                .withAddres(parisAddress)
                .build();

        assertTrue(Shop.mustPayForeignFee(user));
    }

}
