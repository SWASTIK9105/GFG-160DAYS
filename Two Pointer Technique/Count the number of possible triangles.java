// Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.
// Examples:
// Input: arr[] = [4, 6, 3, 7]
// Output: 3
// Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  
// Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
// Output: 6
// Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300].

class Solution {
    public int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length,ans=0;
        for(int i=n-1;i>=2;i--){
            int j=0,k=i-1;
            while(j<k){
                int twoSideSum=arr[j]+arr[k];
                if(twoSideSum>arr[i]){
                    ans+=k-j;
                    k--;
                }
                else j++;
            }
        }
        return ans;
    }
}