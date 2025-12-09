import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintNumbersThatComeTwice {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,1,4,2,5};
        Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(x -> x.getValue() == 2).forEach(System.out::println);
    }
}
