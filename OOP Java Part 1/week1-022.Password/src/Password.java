
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";

        // Write your code here
  
        while(true) {
            System.out.println("Type your password: ");
            String userPassword = reader.nextLine();
            
            if (password.equals(userPassword)) {
                System.out.println("Right!");
                break;
            }
            System.out.println("Wrong!");
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
