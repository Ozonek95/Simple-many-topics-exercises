package wprowadzenie.packageIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public void generatePasswords(int passwords, int passwordLenght){
        List<String> passwordList = new ArrayList<>();

        final String chars ="abcdefghijklmnoperstuwxyzABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%^&*()";

        for (int i = 0; i < passwords; i++) {
            StringBuilder password = new StringBuilder();
            for (int j = 0; j <passwordLenght ; j++) {
                password.append(chars.charAt(new Random().nextInt(chars.length())));
            }
            passwordList.add(password.toString());
        }

        passwordList.forEach(s-> System.out.println(s));


    }
}
