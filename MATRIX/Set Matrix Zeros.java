// You are given a 2D matrix mat[][] of size n x m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0.
class Solution {
    public void setMatrixZeroes(int[][] a) {
        int flag=0;
       for(int i=0;i<a.length;i++){
        if(a[i][0]==0)flag=1;
        for(int j=1;j<a[i].length;j++){
            if (a[i][j]==0) {
                a[i][0]=0;
                a[0][j]=0; }  } }
                for(int i=a.length-1;i>=0;i--){
 for(int j=a[i].length-1;j>0;j--){
if (a[i][0]==0||a[0][j]==0) {
    a[i][j]=0;
}
 }
 if(flag==1)a[i][0]=0;
                }}}