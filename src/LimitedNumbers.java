import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("enter numbers: ");
        while(true) {
            Integer n = Integer.valueOf(scanner.nextLine());

            if(n < 0) {
                break;
            }
            numbers.add(n);
        }
        numbers.stream()
        .filter(e -> e > 0 && e < 6)
        .forEach(System.out::println);
    }
}
