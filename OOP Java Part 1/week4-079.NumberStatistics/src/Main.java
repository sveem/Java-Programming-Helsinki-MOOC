import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEvenNumbers = new NumberStatistics();
        NumberStatistics statsOddNumbers = new NumberStatistics();
        System.out.println("Type numbers: ");

        while (true) {
            int userInput = Integer.parseInt(reader.nextLine());

            if (userInput < 0) {
                break;
            }

            stats.addNumber(userInput);

            if (userInput % 2 == 0) {
                statsEvenNumbers.addNumber(userInput);
            } else {
                statsOddNumbers.addNumber(userInput);
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEvenNumbers.sum());
        System.out.println("sum of odd: " + statsOddNumbers.sum());
    }
}
