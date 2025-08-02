// QUESTION  You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
// Note: Positive number starts from 1. The array can have negative integers too.
// Examples:
// Input: arr[] = [2, -3, 4, 1, 1, 7]
// Output: 3
// Explanation: Smallest positive missing number is 3.
// Input: arr[] = [5, 3, 2, 5, 1]
// Output: 4
// Explanation: Smallest positive missing number is 4.

class Solution {
    public static void swa(int[] a,int i,int j){
        a[i]=(a[i]+a[j])-(a[j]=a[i]);
    }
    public int missingNumber(int[] a) {
        int i=0;
        while(i<a.length){
            if(a[i]>0 && a[i]<=a.length && a[i]!=a[a[i]-1]){
                swa(a,i,a[i]-1);
            } else i++;
        }
    for( i=0;i<a.length;i++){
        if(a[i]!=i+1)return i+1;
    }
        return a.length+1;
    }
}
