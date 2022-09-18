package combridgelabz;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("Adithya@234");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("Adithya@234");
        Assert.assertEquals(false, result);
    }
}
