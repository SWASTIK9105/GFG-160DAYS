// Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 
// Examples:
// Input: mat[][] = [[0, 1, 2], 
//                   [3, 4, 5], 
//                   [6, 7, 8]] 
// Output: [[2, 5, 8],
//          [1, 4, 7],
//          [0, 3, 6]]
// Input: mat[][] = [[1, 2],
//                   [3, 4]]
// Output: [[2, 4],
//          [1, 3]]

class Solution {
    public void swap(int a,int b){
        a=(a+b)-(b=a);
    }
    public void rotateMatrix(int[][] a) {
       int n=a[0].length;
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            swap(a[i][j],a[j][i]);
        }       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                swap(a[i][j], a[i][n-j-1]);
            }
        }
    }
}