// You are given an array with unique elements of stalls[], which denote the positions of stalls. You are also given an integer k which denotes the number of aggressive cows. The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
// Examples:
// Input: stalls[] = [1, 2, 4, 8, 9], k = 3
// Output: 3
// Explanation: The first cow can be placed at stalls[0], 
// the second cow can be placed at stalls[2] and 
// the third cow can be placed at stalls[3]. 
// The minimum distance between cows in this case is 3, which is the largest among all possible ways.
// Input: stalls[] = [10, 1, 2, 7, 5], k = 3
// Output: 4
// Explanation: The first cow can be placed at stalls[0],
// the second cow can be placed at stalls[1] and
// the third cow can be placed at stalls[4].
// The minimum distance between cows in this case is 4, which is the largest among all possible ways.
import java.util.*;
class Solution {
    boolean isPossible(int[] a,int k,int mid){
        int c=1,prev=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]-prev>=mid){
                c++;
                prev=a[i];
            }
        }
        return c>=k;
    }
    public int aggressiveCows(int[] a, int k) {
        Arrays.sort(a);
        int low=0,high=a[a.length-1]-a[0],mid=0,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(a,k,mid)){
                ans=Math.max(ans, mid);
                low=mid+1;
            }else high=mid-1;
        }
        return ans;
        
    }
}