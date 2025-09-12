// Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
// Examples :
// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
// Output: 6
// Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
// Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
// Output: 10
// Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.

import java.util.*;
class Solution {
    public int kthElement(int a[], int b[], int k) {
        int[] c=new int[a.length+b.length];
        int x=0;
        for(int i=0;i<a.length;i++){
c[i]=a[i];
        }
        for(int i=a.length;i<c.length;i++){
c[i]=b[x];
x++;
        }
        Arrays.sort(c);
       return c[k-1]; 
    }
}