// Given an array of integers arr[]. You have to find the Inversion Count of the array. 
// Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
// Examples:
// Input: arr[] = [2, 4, 1, 3, 5]
// Output: 3
// Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
// Input: arr[] = [2, 3, 4, 5, 6]
// Output: 0
// Explanation: As the sequence is already sorted so there is no inversion count.



   class Solution {
    static int inversionCount(int a[]) {
        
        int[] b=new int[a.length];
        return _mergeSort(a,b,0,a.length-1);
    }
    static int _mergeSort(int[] a,int[] b,int x,int y){
        int mid,inv_Count=0;
        if(y>x){
            mid=(y+x)/2;
        inv_Count=_mergeSort(a,b,x,mid);
        inv_Count+=_mergeSort(a,b,mid+1,y);
        inv_Count+=merge(a,b,x,mid+1,y);
        }
        return inv_Count;
    }
    static int merge(int[] a,int[] b,int x,int mid,int y){
        int i,j,k;
        int inv_Count=0;
        i=x;j=mid;k=x;
        while((i<=mid-1)&&(j<=y)){
            if(a[i]<=a[j]){
                b[k++]=a[i++];
            }else{
                b[k++]=a[j++];
                inv_Count=inv_Count+(mid-i);
            }
        }
        while(i<=mid-1)
            b[k++]=a[i++];
            while(j<=y)
            b[k++]=a[j++];
            for(i=x;i<=y;i++)
            a[i]=b[i];
            return inv_Count;
    }
}