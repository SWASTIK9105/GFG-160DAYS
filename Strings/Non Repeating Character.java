// Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.
// Examples:
// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
// Input: s = "racecar"
// Output: 'e'
// Explanation: In the given string, 'e' is the only character in the string which does not repeat.


class Solution {
    public char nonRepeatingChar(String S) {
     
        int[] freq = new int[26]; 
        int[] index = new int[26]; 
        for (int i = 0; i < 26; i++) {
            index[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
            if (index[idx] == -1) {
                index[idx] = i; 
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1 && index[i] < minIndex) {
                minIndex = index[i];
            }
        }
        return minIndex == Integer.MAX_VALUE ? '$' : S.charAt(minIndex);
    }
}
