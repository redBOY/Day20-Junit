package combridgelabz;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Shashi");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("shashi");
        Assert.assertEquals(false, result);
    }


}
