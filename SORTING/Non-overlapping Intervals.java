// Given a 2D array intervals[][], where intervals[i] = [starti, endi]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
// Note: Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval.
// Examples:
// Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
// Output: 1
// Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.
// Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
// Output: 2
// Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.

import java.util.*;
 class Solution {
static int minRemoval (int s[][]) {

Arrays.sort(s, (a,b)->Integer.compare(a[1],b[1]));
int last=0, ans=0,n=s.length;
for(int i=1;i<n;i++){
if (s[i][0]<s[last][1])ans++;
else last=i;
}
return ans;
}}