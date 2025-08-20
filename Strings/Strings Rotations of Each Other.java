// You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.
// Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.
// Examples :
// Input: s1 = "abcd", s2 = "cdab"
// Output: true
// Explanation: After 2 right rotations, s1 will become equal to s2.
// Input: s1 = "aab", s2 = "aba"
// Output: true
// Explanation: After 1 left rotation, s1 will become equal to s2.

import java.util.*;
class Solution {
    public boolean areRotations(String s1, String s2) {
           StringBuilder temp = new StringBuilder(s2);
        temp.append('$').append(s1).append(s1);
        int n = temp.length(),i=0,j=1,m=s2.length();
        int lps[] = new int[n];
        Arrays.fill(lps,0);
        String str = temp.toString();
        while(j<n){
            if(str.charAt(i)==str.charAt(j)){
                lps[j++]=++i;
                if(i==m)return true;
            }
            else if(i!=0)i=lps[i-1];
            else j++;
        }
        return false;
    }
}