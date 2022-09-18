package combridgelabz;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("Adith@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("Adith@gn");
        Assert.assertEquals(false, result);
    }
}
