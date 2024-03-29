import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;
    
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    } 
     
    public void printLine() {
        for (int i = 0; i < this.width; i++) {
            Random random = new Random();

            if (random.nextDouble() > this.density) {
                 System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrint++;
            }
        }
        System.out.println("");
    }
    
    public void print() {
       this.starsInLastPrint = 0;
       for (int i = 0; i < this.height; i++) {
           this.printLine();
       } 
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
