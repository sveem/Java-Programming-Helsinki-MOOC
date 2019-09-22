
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        int searchedValue = Integer.parseInt(reader.nextLine());
        System.out.println();

        boolean isFound = BinarySearch.search(array, searchedValue);

        // Print here the result
        printResult(isFound, searchedValue);
        
    }
    public static void printResult(boolean isFound, int searchedValue) {
       if (isFound) {
           System.out.println("Value " + searchedValue + " is in the array");
       } else {
           System.out.println("Value " + searchedValue + " is not in the array");   
       }
    }
}
