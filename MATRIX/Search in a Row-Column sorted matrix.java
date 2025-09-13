// Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.
// Examples:
// Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
// Output: false
// Explanation: 62 is not present in the matrix, so output is false.
// Input: mat[][] = [[18, 21, 27],[38, 55, 67]], x = 55
// Output: true
// Explanation: 55 is present in the matrix.

class Solution {
    public static boolean matSearch(int a[][], int x) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==x){
                    return true;
                }}}        
  return false ; }}