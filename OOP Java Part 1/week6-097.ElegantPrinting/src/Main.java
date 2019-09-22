
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String elegantPrefix = ", ";
        int i = 0;
        int lengthOfArray = array.length;
        
        while(i < lengthOfArray) {
            if(i == lengthOfArray-1) {
                elegantPrefix = "";
            }
            System.out.print(array[i] + elegantPrefix);
            i++;
        }
    }
}
