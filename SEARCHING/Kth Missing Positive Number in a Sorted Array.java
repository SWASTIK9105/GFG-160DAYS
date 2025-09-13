// Given a sorted array of distinct positive integers arr[], You need to find the kth positive number that is missing from the arr[].
// Examples:
// Input: arr[] = [2, 3, 4, 7, 11], k = 5
// Output: 9
// Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
// Input: arr[] = [1, 2, 3], k = 2
// Output: 5
// Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.

class Solution {
    public int kthMissing(int[] a, int k) {
   int c=0,i=1,j=0;
   while(c<k){
    if(j<a.length&&i==a[j]){
        i++;j++;
    }else{
        i++;
        c++;
    } }        
   return i-1; }
}