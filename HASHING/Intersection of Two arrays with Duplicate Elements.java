// Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both the arrays. The intersection should not have duplicate elements and the result should contain items in any order.
// Note: The driver code will sort the resulting array in increasing order before printing.
// Examples:
// Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
// Output: [1, 3]
// Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
// Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
// Output: [1]
// Explanation: 1 is the only common element present in both the arrays.

import java.util.*;
class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> added = new HashSet<>();
      for (int num : b) {
            if (map.containsKey(num) && map.get(num) > 0 && !added.contains(num)) {
                result.add(num);
                added.add(num); 
                map.put(num, map.get(num) - 1); }        }
        return result; }}