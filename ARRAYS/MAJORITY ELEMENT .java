//QUESTION  Majority Element - More Than n/3
// Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.
// Note: The returned array of majority elements should be sorted.
// Examples:
// Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
// Output: [1, 2]
// Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
// Input:  arr[] = [-5, 3, -5]
// Output: [-5]
// Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).
import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] a) {
        // Code here
        
        int n=a.length;
        int c1=Integer.MIN_VALUE;
        int c2=Integer.MIN_VALUE;
        int ab=0,b=0;
        for(int i=0;i<n;i++){
            int x=a[i];
            if(x==c1){
                ab++;
            } else if(x==c2){
                b++;
            } else if(ab==0){
                c1=x;
                ab=1;
            }else if(b==0){
c2=x;
b=1;}else{
                ab--;
                b--;
            }
        }
        ab=0;
        b=0;
        for(int i=0;i<n;i++){
            if(a[i]==c1) ab++;
            else if(a[i]==c2) b++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        if(ab>n/3) res.add(c1);
        if(b>n/3) res.add(c2);
        Collections.sort(res);
        return res;
    }
}