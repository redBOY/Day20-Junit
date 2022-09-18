package combridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJ {

    public boolean passwordRule3(String password) {
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }

}
