// Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.
// Examples:
// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
// Input: s = "racecar"
// Output: 'e'
// Explanation: In the given string, 'e' is the only character in the string which does not repeat.

import java.util.*;
class Solution {
    public char nonRepeatingChar(String S) {
        // code here
         HashMap<Character,Integer> mm = new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            mm.putIfAbsent(c,0);
            mm.put(c,mm.get(c)+1);
        }
        for(int i=0;i<S.length();i++){
            if(mm.get(S.charAt(i))==1)return S.charAt(i);
        }
        return '$';
    }
}