package combridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJ {
    public boolean phoneNumber(String phoneNumber) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
