// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Note: You need to solve this problem without utilizing the built-in sort function.
// Examples:
// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.
// Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.

class Solution {  
    public static void swapy(int[] a,int i,int j){
a[i]=(a[i]+a[j])-(a[j]=a[i]);
    }
    public void sort012(int[] a) {
        int zero=0,two=a.length-1,i=0;
        while (i<=two) {
            if (a[i]==0) {
                swapy(a,zero,i);
                zero++;
            }else if(a[i]==2){
swapy(a,i,two);
two--;
i--;
            }
        i++;}
    }
    }
