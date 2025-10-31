
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreamQuestions {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 10, 15);
            List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "apple");

            // 1. Find even numbers from list
            System.out.println("Q1: Even numbers → " + numbers.stream().filter(n -> n % 2 == 0).toList()); // [10, 8, 98, 32, 10]

            // 2. Find numbers starting with 1
            System.out.println("Q2: Numbers starting with 1 → " + numbers.stream().map(String::valueOf).filter(s -> s.startsWith("1")).toList()); // [15, 10, 15]

            // 3. Find duplicate elements
            Set<Integer> set = new HashSet<>();
            System.out.println("Q3: Duplicates → " + numbers.stream().filter(n -> !set.add(n)).toList()); // [10, 15]

            // 4. Find the first element
            System.out.println("Q4: First element → " + numbers.stream().findFirst().orElse(-1)); // 10

            // 5. Find count of elements
            System.out.println("Q5: Count → " + numbers.stream().count()); // 9

            // 6. Find max and min
            System.out.println("Q6: Max → " + numbers.stream().max(Integer::compare).get()); // 98
            System.out.println("Q6: Min → " + numbers.stream().min(Integer::compare).get()); // 8

            // 7. Find sum and average
            System.out.println("Q7: Sum → " + numbers.stream().mapToInt(Integer::intValue).sum()); // 262
            System.out.println("Q7: Average → " + numbers.stream().mapToInt(Integer::intValue).average().getAsDouble()); // 29.111...

            // 8. Sort list
            System.out.println("Q8: Ascending sort → " + numbers.stream().sorted().toList()); // [8, 10, 10, 15, 15, 25, 32, 49, 98]
            System.out.println("Q8: Descending sort → " + numbers.stream().sorted(Comparator.reverseOrder()).toList()); // [98, 49, 32, 25, 15, 15, 10, 10, 8]

            // 9. Remove duplicates
            System.out.println("Q9: Unique elements → " + numbers.stream().distinct().toList()); // [10, 15, 8, 49, 25, 98, 32]

            // 10. Convert strings to upper/lower
            System.out.println("Q10: Uppercase → " + strings.stream().map(String::toUpperCase).toList());
            System.out.println("Q10: Lowercase → " + strings.stream().map(String::toLowerCase).toList());

            // 11. Find 2nd highest number
            System.out.println("Q11: Second highest → " + numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get()); // 49

            // 12. Find nth highest number
            int n = 3;
            System.out.println("Q12: 3rd highest → " + numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(n - 1).findFirst().get()); // 32

            // 13. Find frequency of elements
            System.out.println("Q13: Frequency map → " + numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))); // {32=1, 98=1, 49=1, 8=1, 25=1, 10=2, 15=2}

            // 14. Find common elements
            List<Integer> list2 = Arrays.asList(10, 25, 32, 77);
            System.out.println("Q14: Common elements → " + numbers.stream().filter(list2::contains).toList()); // [10, 25, 32, 10]

            // 15. Partition numbers into even/odd
            System.out.println("Q15: Partition → " + numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0))); // {false=[15, 49, 25, 15], true=[10, 8, 98, 32, 10]}

            // 16. Count chars in a string
            String word = "programming";
            System.out.println("Q16: Char frequency → " + word.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))); // {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}

            // 17. Find first non-repeated char
            System.out.println("Q17: First non-repeated → " + word.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey()); // p

            // 18. Reverse each word in a sentence
            String sentence = "hello world java streams";
            System.out.println("Q18: Reverse words → " + Arrays.stream(sentence.split(" "))
                    .map(s -> new StringBuilder(s).reverse().toString())
                    .collect(Collectors.joining(" "))); // olleh dlrow avaj smaerts

            // 19. Check if strings are anagrams
            String s1 = "listen";
            String s2 = "silent";
            boolean isAnagram = s1.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList())
                    .equals(s2.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList()));
            System.out.println("Q19: Are anagrams? → " + isAnagram); // true

            // 20. Find longest string
            System.out.println("Q20: Longest string → " + strings.stream().max(Comparator.comparingInt(String::length)).get()); // banana
        }
    }
