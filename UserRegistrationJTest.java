package combridgelabz;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Srinivas");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("Srinivas");
        Assert.assertEquals(false, result);

    }
}
