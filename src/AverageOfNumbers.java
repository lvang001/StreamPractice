import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Enter numbers type 'end' to exit");

        while (true) {
            String answer = input.nextLine();
            if (answer.equals("end")) {
                break;
            }
            inputs.add(answer);
        }
        System.out.println("The list of inputs are: ");
        System.out.println(inputs);

        double avg = inputs.stream().mapToInt(e -> Integer.valueOf(e)).average().getAsDouble();

        System.out.println(avg);
    }

}
