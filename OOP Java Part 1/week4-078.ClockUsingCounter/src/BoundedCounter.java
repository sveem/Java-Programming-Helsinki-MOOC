
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        String initializeZero = "0";
        if (this.value > 9) {
            initializeZero = "";
        }
        return initializeZero + this.value;
    }

    public int getUpperLimit() {
        return this.upperLimit;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        }
    }
}
