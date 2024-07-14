package course_2.hw_5;

import java.util.regex.Pattern;

public class DataChecking {

    private static final Pattern PATTERN = Pattern.compile("\\w+");
    static  void  check (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !PATTERN.matcher(login).matches()) {
            throw new WrongLoginException();
        }

        if (password.length() > 20 || !PATTERN.matcher(password).matches() || !password.equals(confirmPassword))   {
            throw new WrongPasswordException();
        }
    }

}
