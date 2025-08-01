// QUESTION You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].
// Note : A subarray is a continuous part of an array.
// Examples:
// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
// Input: arr[] = [-2, -4]
// Output: -2
// Explanation: The subarray [-2] has the largest sum -2.

class Solution {
    int maxSubarraySum(int[] a) {
        // Code here
        int s=0,b=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            b=Math.max(b,s);
            if(s<0) s=0;        }
            return b;
    }
}