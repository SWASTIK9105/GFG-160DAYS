// QUESTION Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
// Note: The input strings may contain leading zeros but the output string should not have any leading zeros.
// Input: s1 = "1101", s2 = "111"
// Output: 10100
// Explanation:
//  1101
// + 111
// 10100
// Input: s1 = "00100", s2 = "010"
// Output: 110
// Explanation: 
//   100
// +  10
//   110

// User function Template for Java

class Solution {
    public String addBinary(String A, String B) {
    StringBuilder sb = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while(i>=0||j>=0){
int a= i>=0?A.charAt(i)-'0':0;
int b= j>=0?B.charAt(j)-'0':0;
int total=a+b+carry;
if(total==0){
carry=0;
sb.append('0');
}else if(total==1){
carry=0;
sb.append('1');
}else if(total==2){
carry=1;
sb.append('0');
}else{
carry=1;
sb.append('1');
}
            i--;j--;
        }
        if(carry!=0) sb.append(carry);
        while(sb.charAt(sb.length()-1)=='0') sb.setLength(sb.length()-1);
        return sb.reverse().toString();
    }
}
