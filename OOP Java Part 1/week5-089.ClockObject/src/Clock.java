
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.seconds = new BoundedCounter(59);
        this.minutes = new BoundedCounter(59);
        this.hours = new BoundedCounter(23);
        // set values
        this.seconds.setValue(secondsAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.hours.setValue(hoursAtBeginning);
    }

    public void tick() {
        // Clock advances by one seconds
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    @Override
    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
