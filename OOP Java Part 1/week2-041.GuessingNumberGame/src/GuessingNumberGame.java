
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberOfUserInputs = 1;
        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + numberOfUserInputs);
            } 
            if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + numberOfUserInputs);
            } 
            if (number == numberDrawn) {
                break;
            }
            numberOfUserInputs++;
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
