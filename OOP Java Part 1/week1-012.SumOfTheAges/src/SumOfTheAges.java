
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
 
        System.out.println("Type your name: ");
        String firstNameInput = reader.nextLine();
        System.out.println("Type your age");
        int firstAgeInput = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        System.out.println("Type your name: ");
        String secondNameInput = reader.nextLine();
        System.out.println("Type your age");
        int secondAgeInput = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println(firstNameInput + " and " + secondNameInput + 
                " are " + (firstAgeInput + secondAgeInput) 
                + " years old in total.");
    }
}
