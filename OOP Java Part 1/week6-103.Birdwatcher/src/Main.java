import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
         ArrayList<Birds> collection = new ArrayList<Birds>();
        
        Scanner reader = new Scanner(System.in);
        
        while (true){
            System.out.println("?");
            String command = reader.nextLine();
            
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latName = reader.nextLine();
                Birds buffer = new Birds(name, latName);
                collection.add(buffer);
            }
            
            if (command.equals("Observation")){
                System.out.println("What was observed:?");
                String obs = reader.nextLine();
                
                for(Birds i : collection){
                    if(i.getName().equals(obs)){
                        i.Observed();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }
            }
            
            if (command.equals("Statistics")){
                for (Birds i : collection) {
                    System.out.println(i);
                }
            } 
            
            if (command.equals("Show")) {
                System.out.println("What? ");
                String nam = reader.nextLine();
                for(Birds i : collection){
                    if(i.getName().equals(nam)){
                        System.out.println(i);
                    }
                }
            }
            
            if (command.equals("Quit")){
                break;
            }
        }
    }
}