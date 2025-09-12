// You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
// If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
// Note: Consider the element before the first element and the element after the last element to be negative infinity.
// Examples :
// Input: arr = [1, 2, 4, 5, 7, 8, 3]
// Output: true
// Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
// Input: arr = [10, 20, 15, 2, 23, 90, 80]
// Output: true
// Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid.

class Solution {
    public int peakElement(int[] a) {
        int n = a.length;
        if (n == 1) return 0;
        if (a[0] >= a[1]) return 0;
        if (a[n - 1] >= a[n - 2]) return n - 1;
        for (int i = 1; i < n - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                return i;
            }}
        return -1; 
    }
}
