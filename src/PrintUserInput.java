import java.util.ArrayList;
import java.util.Scanner;

public class PrintUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<String>();

        System.out.println("Enter words: ");

        while (true) {
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }
            lines.add(input);
        }
        lines.forEach(System.out::println);
    
    }
}
