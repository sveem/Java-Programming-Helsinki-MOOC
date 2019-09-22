public class Counter {
    private int valueOfCounter;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
       this.valueOfCounter = startingValue;
       this.check = check;
    }
    
    public Counter(int startingValue) {
       this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.valueOfCounter;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.valueOfCounter += increaseAmount;
        }
    }
    
    public void decrease() {
        decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }

        this.valueOfCounter -= decreaseAmount;

        if (this.check && this.valueOfCounter < 0) {
            this.valueOfCounter = 0;
        }
    }
}
