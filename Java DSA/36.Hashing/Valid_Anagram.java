import java.util.*;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        // Create a HashMap to count character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count characters in string s
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Process characters in string t
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
    
    public static void main(String args[]) {
        Valid_Anagram solution = new Valid_Anagram();
        String s = "tulip";
        String t = "lipid";

        System.out.println(solution.isAnagram(s, t));
    }
}