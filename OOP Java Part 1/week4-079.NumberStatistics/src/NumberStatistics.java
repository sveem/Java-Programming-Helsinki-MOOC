
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers++;
        if (number == -1) {
            return;
        }
        sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        double averageSum = 0;
        if (this.amountOfNumbers > 0) {
            averageSum = (double)this.sum / this.amountOfNumbers;
        }
        return averageSum;
    }
}
