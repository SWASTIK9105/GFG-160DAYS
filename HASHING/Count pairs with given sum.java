// You are given an array arr[] and an integer target. You have to count all pairs in the array such that their sum is equal to the given target.
// Examples:
// Input: arr[] = [1, 5, 7, -1, 5], target = 6 
// Output: 3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
// Input: arr[] = [1, 1, 1, 1], target = 2 
// Output: 6
// Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).

class Solution {
    int countPairs(int a[], int b) {
        int i=0;
        for(int c=0;c<a.length;c++){
            for(int d=c+1;d<a.length;d++){
if(a[c]+a[d]==b){
  i++;
}}}
        return i;
    }
}