import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                System.out.print("Hello and welcome!");
//        Given the array of strings. Each string contains two parts - Word and its count separated by comma(,):
//        - Filter by word(1st part) length > 4
//                - Sort by word count(2nd part) desc
//                - Find 2nd highest word based on above sorted result
//        Solve using Java Streams API
        String[] strArray = {"POINT,2342342", "POINTS,2341345",
                "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};

//        Arrays.stream(strArray)
//                .filter(s -> s.split(",")[0].length() > 4)
//                .map(s -> s.split(",", 2))
//                .filter( arr -> !"null".equalsIgnoreCase(arr[1]))
//                .sorted(arr ->
//                        (String[] arr) -> Integer.parseInt(arr[1]))
//                .skip(1).get();

        System.out.println(Arrays.stream(strArray)
                .filter(s -> s.split(",")[0].length() > 4)
                .map(s -> s.split(",", 2))
                .filter( arr -> !"null".equalsIgnoreCase(arr[1]))
                .sorted(Comparator.comparingDouble(
                        (String[] arr) -> Double.parseDouble(arr[1])).reversed()
                ).map(arr -> arr[0]+":"+arr[1])
                .toList().get(1));


    }
}