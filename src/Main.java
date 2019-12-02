import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = Arrays.asList(args).stream().mapToInt(s -> Integer.parseInt(s));
        intStream.forEach(System.out::println);
    }
}
