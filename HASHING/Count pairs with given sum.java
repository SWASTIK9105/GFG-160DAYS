// You are given an array arr[] and an integer target. You have to count all pairs in the array such that their sum is equal to the given target.
// Examples:
// Input: arr[] = [1, 5, 7, -1, 5], target = 6 
// Output: 3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
// Input: arr[] = [1, 1, 1, 1], target = 2 
// Output: 6
// Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).

import java.util.HashMap;
class Solution {
    int countPairs(int a[], int b) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int complement = b - a[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }   return count; }}