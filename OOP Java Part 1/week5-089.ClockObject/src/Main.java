public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(22, 50, 59);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
