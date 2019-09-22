import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int passwordLength;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        String alhabets = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while ( i < this.passwordLength) {
            password += alhabets.charAt(random.nextInt(alhabets.length()));
            i++;
        }
        return password;
    }
}
