// Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a ≤ b whose sum is closest to target.
// Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.
// Examples:
// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]
// Explanation: As 5 + 20 = 25 is closest to 25.
// Input: arr[] = [5, 2, 7, 1, 4], target = 10
// Output: [2, 7]
// Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
             Arrays.sort(arr);
        int i=0,j=arr.length-1,diff=Integer.MAX_VALUE,first=-1,second=-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<j){
            int sum = arr[i]+arr[j];
            if((diff>Math.abs(sum-target)) || ((diff==Math.abs(sum-target)) && arr[j]-arr[i]>second-first)){
                first=arr[i];
                second=arr[j];
                diff=Math.abs(sum-target);
            }
            if(sum<=target)i++;
            else j--;
        }
        if(first==-1 && second==-1)return ans;
        ans.add(first);
        ans.add(second);
        return ans;}}