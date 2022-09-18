package combridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJ {
    public boolean password(String password) {
        String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
