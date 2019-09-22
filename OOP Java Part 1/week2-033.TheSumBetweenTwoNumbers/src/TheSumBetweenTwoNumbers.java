
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0; 
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int placeholder = first;       
        
        while(placeholder <= last) {
            sum += placeholder;
            placeholder++;
        }
        System.out.println("The sum is " + sum);
    }
}
