import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = this.birthday =  new MyDate(Calendar.getInstance().get(Calendar.DATE),
        Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
         int day = Calendar.getInstance().get(Calendar.DATE);
         int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
         int year = Calendar.getInstance().get(Calendar.YEAR);
         MyDate currentDate = new MyDate(day, month, year);
         
        return currentDate.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
