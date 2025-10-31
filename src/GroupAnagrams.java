import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> sAnagram = groupAnagrams(new String[]{"anc", "cna", "bbc"});
        for (List<String> grp : sAnagram ) {
            for (String word: grp) {
                System.out.print(word+ " ");
            }
            System.out.println();
        }
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyToAnagrams = new HashMap<>();

        for (final String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            System.out.println("hi");
            System.out.println(chars);
            String key = String.valueOf(chars);
            System.out.println("key---" + key);
            keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(keyToAnagrams.values());
    }
}
