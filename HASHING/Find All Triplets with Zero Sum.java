// Given an array arr[], find all possible triplets i, j, k in the arr[] whose sum of elements is equals to zero. 
// Returned triplet should also be internally sorted i.e. i<j<k.
// Examples:
// Input: arr[] = [0, -1, 2, -3, 1]
// Output: [[0, 1, 4], [2, 3, 4]]
// Explanation: Triplets with sum 0 are:
// arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
// arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
// Input: arr[] = [1, -2, 1, 0, 5]
// Output: [[0, 1, 2]]
// Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<List<Integer>> findTriplets(int[] a) {
       int n = a.length;
List<List<Integer>> ans = new ArrayList<>();
HashMap<Integer,ArrayList<Integer>> mm = new HashMap<>();
for(int i=0;i<n;i++){
mm.putIfAbsent(a[i],new ArrayList<Integer>());
mm.get(a[i]).add(i);}
for(int i=0;i<n-2;i++){
for(int j=i+1;j<n-1;j++){
int rem = 0-(a[i]+a[j]);
if(mm.get(rem) != null){
int size=mm.get(rem).size();
for(int k=size-1;k>=0;k -- ){
if(mm.get(rem).get(k) <= j)break;
ans.add(new ArrayList<>(List.of(i,j,mm.get(rem).get(k))));
}}}}
Collections.sort(ans,(o1,o2)->o1.get(2).compareTo(o2.get(2)));
return ans;
    }
}