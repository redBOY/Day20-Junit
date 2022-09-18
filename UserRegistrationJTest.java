package combridgelabz;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("AdithyaSrinivas@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("AdithyaSrinivas@gmail.com");
        Assert.assertEquals(false, result);
    }
}
