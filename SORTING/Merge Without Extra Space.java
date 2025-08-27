// Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.
// Examples:
// Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
// Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
// Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
// Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
// Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
// Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].

import java.util.*;
class Solution {
    public static void swas(int[] a,int i,int[] b,int j){
        a[i]=(a[i]+b[j])-(b[j]=a[i]);
    }
    public void mergeArrays(int a[], int b[]) {
      int i=a.length-1,j=0;
      while(i>=0 && j<b.length){
          if(a[i]<=b[j])break;
          swas(a,i--,b,j++);
      }
      Arrays.sort(a);
      Arrays.sort(b);
    }
}
