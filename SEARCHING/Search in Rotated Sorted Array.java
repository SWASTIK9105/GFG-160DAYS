// Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key.  If the key is not present in the array, return -1.
// Examples :
// Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
// Output: 8
// Explanation: 3 is found at index 8.
// Input: arr[] = [3, 5, 1, 2], key = 6
// Output: -1
// Explanation: There is no element that has value 6.

class Solution {
    int search(int[] a, int k) {
        int i=0;
      for(i=0;i<a.length;i++){
          if(a[i]==k)break;
    } 
    if(i==a.length)return -1;
      return i;    }}