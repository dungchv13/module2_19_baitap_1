import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {

    private static final String REGEX = "^[CAP]\\d{4}[GHIKLM]$";


    public ValidateClassName() {
    }


    public boolean valadate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
