
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int base = 1;
        
        // Write your code here
        System.out.println("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        
        while(base <= number) {
            System.out.println(base);
            base++;
        }
    }
}
