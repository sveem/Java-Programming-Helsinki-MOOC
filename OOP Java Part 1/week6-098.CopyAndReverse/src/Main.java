
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);
        System.out.println("Copied Array: " + copied);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] resultArray = new int[getArrayLength(array)];
        for (int i = 0; i < getArrayLength(resultArray); i++) {
            resultArray[i] = array[i];
        }
        return resultArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[getArrayLength(array)];

        for (int i = 0; i < getArrayLength(reversedArray); i++) {
            reversedArray[i] = array[(getArrayLength(array) - 1) - i];

        }
        return reversedArray;
    }

    public static int getArrayLength(int[] array) {
        return array.length;
    }
}
