// QUESTION   You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.
// Examples:
// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
// Input: arr[] = [10, 20, 30]
// Output: [10, 20, 30]
// Explanation: No change in array as there are no 0s.

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] a) {
        // code here
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                sap(a,i,j);
                i++;
            }
        }
    }
    void sap(int []a,int i,int j){
        a[i]=(a[i]+a[j])-(a[j]=a[i]);
    }
}