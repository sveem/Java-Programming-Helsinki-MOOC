public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter one = new Counter (2, true);
        Counter two = new Counter (900, true);
        Counter three = new Counter (true);
        Counter four = new Counter ();
                      
        one.decrease();
        two.decrease(7);
        
        System.out.println("ONE: " + one.value());
        System.out.println("TWO: " + two.value());

    }
}
