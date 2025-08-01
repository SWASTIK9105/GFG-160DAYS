// QUESTION Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
// Note: It is guaranteed that the answer fits in a 32-bit integer.
// Examples
// Input: arr[] = [-2, 6, -3, -10, 0, 2]
// Output: 180
// Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.
// Input: arr[] = [-1, -3, -10, 0, 6]
// Output: 30
// Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

class Solution {
    int maxProduct(int[] x) {
        int a=Integer.MIN_VALUE,b=1,c=1;
        for(int i=0;i<x.length;i++){
            b*=x[i];
            c*=x[x.length-1-i];
            a=Math.max(a,Math.max(b,c));
            if(b==0)b=1;
            if(c==0)c=1;
        }
    return a;}
}