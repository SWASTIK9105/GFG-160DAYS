// Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.
// Note: In the case of a single vertical line it will not be able to hold water.
// Examples:
// Input: arr[] = [1, 5, 4, 3]
// Output: 6
// Explanation: 5 and 3 are 2 distance apart. So the size of the base is 2. Height of container = min(5, 3) = 3. So, total area to hold water = 3 * 2 = 6.
// Input: arr[] = [3, 1, 2, 4, 5]
// Output: 12
// Explanation: 5 and 3 are 4 distance apart. So the size of the base is 4. Height of container = min(5, 3) = 3. So, total area to hold water = 4 * 3 = 12.

class Solution {
    public int maxWater(int a[]) {
            int i=0,j=a.length-1, ans=0;
        while(i<j){
            ans = Math.max(ans,(j-i)*(Math.min(a[i],a[j])));
            if(a[i]<a[j])i++;
            else j--; }
        return ans; }}