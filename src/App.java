import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("add to list");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        long numbersDivisbleByTwo = list.stream().mapToInt(e -> Integer.valueOf(e)).filter(num -> num % 2 ==0).count();

        System.out.println(numbersDivisbleByTwo);
    }
}
