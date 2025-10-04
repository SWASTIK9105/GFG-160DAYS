// You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
// Note: pairs should have elements of distinct indexes. 
// Examples :
// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3
// Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
// Input: arr[] = [1, 1, 1, 1], target = 2
// Output: 6
// Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.

// User function Template for Java

class Solution {
    int countPairs(int arr[], int target) {
         int i=0,j=arr.length-1,ans=0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                if(arr[i]==arr[j]){
                    int temp = j-i;
                    ans+=(temp*(temp+1))/2;
                    break;
                }
                else{
                    int right=1,left=1;
                    while(i<j && arr[i]==arr[i+1]){
                        left++;
                        i++;
                    }
                    while(i<j && arr[j]==arr[j-1]){
                        right++;
                        j--;
                    }
                    ans+=(left*right);
                    i++;
                    j--;
                }
            }
            else if(sum<target)i++;
            else j--;
        }
        return ans;
    }
}
