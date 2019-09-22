public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int convertToDays(MyDate date) {
        int daysToDate = date.day + (date.month * 30) + (date.year * 12 * 30);
        return daysToDate;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int currentDate = convertToDays(this);
        int dateToCompareWith = convertToDays(comparedDate);
        
        int differenceInDays = Math.abs(currentDate - dateToCompareWith);
        return differenceInDays / 360;
    }
}
