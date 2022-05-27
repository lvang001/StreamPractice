import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        System.out.println(positive(list));
        System.out.println(list.stream().count());
        
    }

    public static List<Integer>positive(List<Integer> numbers) {
        return numbers.stream().filter(e -> e > 0).collect(Collectors.toList());
    }

}
