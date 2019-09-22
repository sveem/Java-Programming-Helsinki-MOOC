
import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numberOfUserInputs = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Type numbers: ");
        
        while(true) {
            int number = Integer.parseInt(reader.nextLine());
            if(number < 0) {
                break;
            }
            sum = sum + number;
            numberOfUserInputs++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        double average = ((double)sum) / numberOfUserInputs; 
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numberOfUserInputs);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers " + odd);
    }
}
