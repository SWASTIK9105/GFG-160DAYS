// Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
// Examples:
// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: arr[3] + arr[4] = -3 + 1 = -2
// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: None of the pair makes a sum of 0

import java.util.HashSet;
class Solution {
    boolean twoSum(int[] a, int b) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : a) {
            if (seen.contains(b - num)) {
                return true; 
            }seen.add(num); }
 return false; 
    }}