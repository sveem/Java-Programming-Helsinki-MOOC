
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> listWithStudents = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();

            listWithStudents.add(new Student(studentName, studentNumber));
        }

        for (Student student : listWithStudents) {
            System.out.println(student);
        }

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (Student student : listWithStudents) {
            boolean isStudentNameInList = student.getName().contains(searchTerm);
            if (isStudentNameInList) {
                System.out.println(student);
            }
        }
    }
}
