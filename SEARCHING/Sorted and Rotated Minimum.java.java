// A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 
// Examples:
// Input: arr[] = [5, 6, 1, 2, 3, 4]
// Output: 1
// Explanation: 1 is the minimum element in the array.
// Input: arr[] = [3, 1, 2]
// Output: 1
// Explanation: Here 1 is the minimum element.

class Solution {
    public int findMin(int[] a) {
    int min=Integer.MAX_VALUE;
               for(int i=0;i<a.length;i++){
                if(a[i]<min) min=a[i];
                      }
    return min;}
}