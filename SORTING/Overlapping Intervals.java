// Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.
// Examples:
// Input: arr[][] = [[1, 3], [2, 4], [6, 8], [9, 10]]
// Output: [[1, 4], [6, 8], [9, 10]]
// Explanation: In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4]. Therefore we will return [[1, 4], [6, 8], [9, 10]].
// Input: arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
// Output: [[1, 9]]
// Explanation: In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].

import java.util.*;
class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] x) {
        if (x == null || x.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        result.add(x[0]);
        for (int i = 1; i < x.length; i++) {
            int[] last = result.get(result.size() - 1);
            int[] current = x[i];
            if (last[1] >= current[0]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                result.add(current);
            }}
        return result;
    }}