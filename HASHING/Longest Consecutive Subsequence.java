// Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
// Examples:
// Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
// Output: 6
// Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
// Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
// Output: 4
// Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.

import java.util.HashMap;

class Solution {
   public int longestConsecutive(int[] arr) {
        int ans=1;
        HashMap<Integer,Integer> mm = new HashMap<>();
        for(int x:arr){
            if(mm.get(x)==null){
                int left = mm.getOrDefault(x-1,0);
                int right = mm.getOrDefault(x+1,0);
                int total = left+right+1;
                mm.put(x,total);
                mm.put(x-left,total);
                mm.put(x+right,total);
                ans=Math.max(ans,total);
            }        }
        return ans;    }}