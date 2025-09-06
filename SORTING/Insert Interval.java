// Geek has an array of non-overlapping intervals intervals[][] where intervals[i] = [starti , endi] represent the start and the end of the ith event and intervals is sorted in ascending order by starti . He wants to add a new interval newInterval[] = [newStart, newEnd] where newStart and newEnd represent the start and end of this interval.
// Help Geek to insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
// Examples:
// Input: intervals[][] = [[1, 3], [4, 5], [6, 7], [8, 10]], newInterval[] = [5, 6]
// Output: [[1, 3], [4, 7], [8, 10]]
// Explanation: The newInterval [5, 6] overlaps with [4, 5] and [6, 7]. So, they are merged into one interval [4, 7].
// Input: intervals[][] = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], newInterval[] = [4, 9]
// Output: [[1, 2], [3, 10], [12, 16]]
// Explanation: The new interval [4, 9] overlaps with [3, 5], [6, 7] and [8, 10]. So, they are merged into one interval [3, 10].


import java.util.*;
 class Solution {
    public ArrayList<int[]> insertInterval(int a[][],int[] b){
      ArrayList<int[]> ans = new ArrayList<>();
        boolean merged=false;
        int start=b[0],end=b[1];
        for(int x[]:a){
            if(x[1]<b[0])ans.add(x);
            else if(x[0]>b[1]){
                if(!merged){
                    int temp[] = new int[2];
                    temp[0]=start;
                    temp[1]=end;
                    ans.add(temp);
                    merged=true;
                }
                ans.add(x);
            }
            else{
                start=Math.min(x[0],start);
                end=Math.max(x[1],end);
            }
        }
        if(!merged){
            int temp[] = new int[2];
            temp[0]=start;
            temp[1]=end;
            ans.add(temp);
        }
        return ans;
    }
 }