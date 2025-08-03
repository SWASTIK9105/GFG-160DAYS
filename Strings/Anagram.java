// Question  Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
// Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
// Examples:
// Input: s1 = "geeks" s2 = "kseeg"
// Output: true 
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.
// Input: s1 = "allergy", s2 = "allergyy" 
// Output: false 
// Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.

import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
       int freq[]=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s1.length();i++)freq[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)freq[s2.charAt(i)-'a']--;
        for(int x:freq)if(x!=0)return false;
        return true;   }
}