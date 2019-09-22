
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> names = new ArrayList<String>();
        
        while (true) {
            System.out.println("Type a word: ");
            String name = reader.nextLine();
            if(name.equals("")) {
                break;
            }
            names.add(name);
        }
        System.out.println("You typed the following words: ");
        Collections.sort(names);
        
        for (String singleName : names) {
            System.out.println(singleName);
        }              
    }
}
