public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        String printStars = "";
        while(amount > 0) {
            printStars += "*";
            amount--;
        }
        System.out.println(printStars);
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int iteration = sideSize;
        while(iteration > 0) {
            printStars(sideSize);
            iteration--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int iterations = height;
        while (iterations > 0) {
            printStars(width);
            iterations--;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int iterations = 1;
        while (iterations <= size) {
            printStars(iterations);
            iterations++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }
}
