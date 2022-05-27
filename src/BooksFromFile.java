import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;


public class BooksFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public static List<Book>Books(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length > 3)
                    .map(p -> new Book(p[0], Integer.parseInt(p[1]), Integer.parseInt(p[2]), p[3]))
                    .collect(Collectors.toList());
          } catch (IOException e) {
            e.printStackTrace();
          }
          return Collections.emptyList();
    }
}
