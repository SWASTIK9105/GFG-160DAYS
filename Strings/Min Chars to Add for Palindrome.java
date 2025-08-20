// Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.
// Note: A palindrome string is a sequence of characters that reads the same forward and backward.
// Examples:
// Input: s = "abc"
// Output: 2
// Explanation: Add 'b' and 'c' at front of the above string to make it palindrome: "cbabc"
// Input: s = "aacecaaaa"
// Output: 2
// Explanation: Add 2 a's at front of the above string to make it palindrome: "aaaacecaaaa"

import java.util.*;
class Solution {
    public int minChar(String s) {
      StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        StringBuilder com = new StringBuilder();
        com.append(s).append('$').append(rev.toString());
        String complete = com.toString();
        int n = complete.length(),i = 0, j = 1;
        int lps[] = new int[n];
        Arrays.fill(lps,0);
        while(j<n){
            if(complete.charAt(j) == complete.charAt(i))lps[j++] = ++i;
            else if(i!=0)i=lps[i-1];
            else j++;
        }
        return s.length()-i;  
    }
}