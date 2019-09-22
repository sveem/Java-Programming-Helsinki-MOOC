import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) { // 104.1
        // write the code here
        int smallestElement = array[0];
        for (int el : array) {
            if (smallestElement > el) {
                smallestElement = el;
            }
        }
        return smallestElement;
    }

    public static int indexOfTheSmallest(int[] array) { // 104.3
        // code goes here
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) { // 104.3
        // write the code here
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) { //104.4
    // code goes here
        int copyOfArrayIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = copyOfArrayIndex1;
    }
    
    public static void sort(int[] array) {
        System.out.println(array);
        
        for(int i = 0; i < array.length; i++) {
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
        }
        System.out.println(array);
    }
}
