import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> personCollection;
    
    public Phonebook() {
        this.personCollection = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
      this.personCollection.add(new Person(name, number));
    }
    
    public void printAll() {
        for(Person person : this.personCollection) {
            System.out.println(person.getName() + " number: " + person.getNumber());
        }
    }
    
    public String searchNumber(String name) {
        for (Person person : this.personCollection) {
            if (name.equals(person.getName())) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
