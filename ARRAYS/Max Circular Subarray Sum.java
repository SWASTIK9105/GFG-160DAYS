// Question  You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.
// Examples
// Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
// Output: 22
// Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
// Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
// Output: 23
// Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].

class Solution {
    public int maxCircularSum(int x[]) {
        int a=Integer.MAX_VALUE,b=Integer.MIN_VALUE,c=0,d=0,e=0;
        for(int i=0;i<x.length;i++){
            e+=x[i];
           d=Math.min(x[i],d+x[i]);
           a=Math.min(a,d);
           c=Math.max(x[i],c+x[i]);
           b=Math.max(b,c);
              }
              if(b<0) return b;
              return Math.max(b,e-a);
    }
}