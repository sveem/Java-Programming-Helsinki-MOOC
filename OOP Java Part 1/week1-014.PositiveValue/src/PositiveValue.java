
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
 
        System.out.println("Type a number: ");
        int userInput = Integer.parseInt(reader.nextLine());
        
        if (userInput > 0) {
            System.out.println("The number is positive.");
        }
        
        if (userInput <= 0) {
            System.out.println("The number is not positive.");
        }
    }
}
