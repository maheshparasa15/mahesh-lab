import java.util.*;

public class LongestSubstringMap {
    public static String longestSubstring(String s) {
      String longest = "";
      int left =0;
      HashSet<Character> set = new HashSet<>();
      for(int right = 0; right < s.length(); right++) {
          char ch = s.charAt(right);
          while (set.contains(ch)) {
              set.remove(s.charAt(left));
              left++;
          }
          set.add(ch);

          if (right - left + 1 > longest.length()) {
              longest = s.substring(left, right + 1);
          }
      }
      return longest;
    }

    public static void main(String[] args) {
        System.out.println("longest sub string :: "+longestSubstring("pwwkew")); // wke
    }
}