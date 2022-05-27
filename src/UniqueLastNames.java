import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Person> people = new ArrayList<Person>();

       while (true) {
           System.out.println("Continue personal information input? 'quit' ends");

           String input = scanner.nextLine();

           if(input.equals("quit")) {
               break;
           }
           System.out.println("Input first name: ");
           String fName = scanner.nextLine();
           System.out.println("Input last name: ");
           String lName = scanner.nextLine();
           System.out.println("Input the year of birth: "); {
            Integer bYear = Integer.parseInt(scanner.nextLine());

            people.add(new Person(fName, lName, bYear));

           }

       }
       System.out.println("Unique last name in alphabetical order: ");
       people.stream()
       .map(e -> e.getLName())
       .distinct()
       .sorted()
       .forEach(System.out::println);

   } 
}
