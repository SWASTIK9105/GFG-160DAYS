// QUESTION   Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
// Note:  A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.
// Examples:
// Input: arr[] = [2, 4, 1, 7, 5, 0]
// Output: [2, 4, 5, 0, 1, 7]
// Explanation: The next permutation of the given array is [2, 4, 5, 0, 1, 7].
// Input: arr[] = [3, 2, 1]
// Output: [1, 2, 3]
// Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

class Solution {
    void nextPermutation(int[] a) {
        // code here
        int n=a.length;
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(a[j]<=a[i]){
                j--;
            }
            swapy(a,i,j);
        }
        revo(a,i+1,n-1);
        
    }
    static void swapy(int[] a,int i,int j){
        a[i]=(a[i]+a[j])-(a[j]=a[i]);
    }
    static void revo(int[] a,int s,int e){
        while(s<e){
            swapy(a,s,e);
            s++;
            e--;
        }
    }
}