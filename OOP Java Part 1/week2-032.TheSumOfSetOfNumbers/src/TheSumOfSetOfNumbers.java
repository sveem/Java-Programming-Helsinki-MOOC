
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int placeholder = 1;
        int sum = 0;
        
        System.out.println("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        
        while(placeholder <= number) {
            sum = sum + placeholder;
            placeholder++;
        }
        System.out.println("Sum in " + sum);
    }
}
