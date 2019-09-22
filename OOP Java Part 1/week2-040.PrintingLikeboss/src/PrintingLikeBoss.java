public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String printStars = "";
        while (amount > 0) {
            printStars += "*";
            amount--;
        }
        System.out.println(printStars);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String printWhiteSpaces = "";
        while (amount > 0) {
            amount--;
            printWhiteSpaces += " ";
        }
        System.out.print(printWhiteSpaces);
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        while (size > 0) {
            size--;
            printWhitespaces(size);
            printStars(stars);
            stars++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int iterations = height;
        int stars = 1;
        
        while(iterations > 0) {
            iterations--;
            printWhitespaces(iterations);
            printStars(stars);
            stars +=2;
        }
            printWhitespaces(height - 2);
            printStars(3);
            printWhitespaces(height - 2);
            printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
