public class six_Valid_Anagram {
    public static void main(String[] args) {
        
    }
    /*
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    Anagram:
    An anagram is a word or phrase formed by rearranging the letters of a different 
    word or phrase, using all the original letters exactly once.
 

    Example 1:

    Input: s = "anagram", t = "nagaram"

    Output: true

    Example 2:

    Input: s = "rat", t = "car"

    Output: false
    */
    static boolean isAnagram(String s, String t) {
        int[] s_chars = new int[26];
        for (int i=0; i<s.length(); i++) s_chars[s.charAt(i)-'a']++;
        int[] t_chars = new int[26];
        for (int i=0; i<t.length(); i++) t_chars[t.charAt(i)-'a']++;
        for (int i=0; i<26; i++) {
            if (s_chars[i] != t_chars[i]) return false;
        }
        return true;
    }

    //best way 
    //time complexity O(2N)
    class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for (int i=0; i<s.length(); i++) arr[s.charAt(i)-'a']++;
        for (int i=0; i<t.length(); i++){ 
            int index = t.charAt(i) - 'a';
            arr[index]--;
            if (arr[index] < 0) return false;
        }
        return true;
    }
}
}
