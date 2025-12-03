package PracticePrograms;

public class AnagramsJ8NNormal {

    public static void main(String[] args) {
        String a = "abcde";
        String b = "abedc";

        System.out.println(isAnagram(a,b));

    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] map = new int[26];
        for(char c: a.toCharArray()) map[c - 'a']++;
        for(char c: b.toCharArray()) map[c - 'a']--;

        for(int count : map) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }



}
