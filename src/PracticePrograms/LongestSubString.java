package PracticePrograms;

import java.util.HashSet;

public class LongestSubString {
    public static String longestSubString(String s) {
        int left = 0;
        String longest = "";
        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            if(right - left + 1 > longest.length()) {
                longest = s.substring(left, right + 1);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        System.out.println("longest substring:" + longestSubString(input));
    }
}
