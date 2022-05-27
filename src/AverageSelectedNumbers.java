import java.util.ArrayList;
import java.util.Scanner;

public class AverageSelectedNumbers {
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

        System.out.println("Would you like the average of positive (P) or negative (N) numbers");

        String answerTwo = input.nextLine();

        String answerTwoToLowerCase = answerTwo.toLowerCase();

        if(answerTwoToLowerCase.equals("n")) {

            double avgNeg = inputs.stream().mapToInt(e -> Integer.valueOf(e)).filter( e-> e < 0).average().getAsDouble(); 

            System.out.println(avgNeg);
        }else {
            double avgPos = inputs.stream().mapToInt(e -> Integer.valueOf(e)).filter( e-> e > 0).average().getAsDouble();
            System.out.println(avgPos); 
        }

    }
}
