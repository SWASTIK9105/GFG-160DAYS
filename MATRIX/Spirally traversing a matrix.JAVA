// You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.
// Examples:
// Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
// Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
// Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
// Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] x) {
        int n = x.length, m = x[0].length;
        int a = 0, b = 0, c = n - 1, d = m - 1;
      ArrayList<Integer> ans = new ArrayList<>();
      while (a <= c && b <= d) {
            for (int i = b; i <= d; i++)ans.add(x[a][i]);
            a++;
            for (int i = a; i <= c; i++)ans.add(x[i][d]);
            d--;
            if (a <= c) {
                for (int i = d; i >= b; i--)ans.add(x[c][i]);     
                c--;}
            if (b <= d) {
                for (int i = c; i >= a; i--) ans.add(x[i][b]);              
                b++; }
            }
        return ans;}}