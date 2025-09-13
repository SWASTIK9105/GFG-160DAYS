// You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.
// Examples:
// Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
// Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
// Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
// Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] x) {
        int n=a.length,m=a[0].length,s=n*m,a=0,b=0,c=n-1,d=n-1;
       ArrayList ans=new ArrayList<>();
       while(ans.length<s){
        for(int i=b;i<=d &&ans.length<s;i++)ans.push(x[a][i]);
        a++;
        for(int i=a;i<=c &&ans.length<s;i++)ans.push(x[i][d]);
        d--;
        for(int i=d;i>=b&&ans.length<s;i--)ans.push(x[c][i]);
        c--;
        for(int i=b;i>=a&&ans.length<s;i--)ans.push(x[i][b]);
        b++;
       } 
    return ans;}
}
