
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
 
        System.out.println("Type a number: ");
        int firstInput = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int secondInput = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + firstInput + " / " 
            + secondInput + " = " + (1.0 * firstInput / secondInput));
    }
}
