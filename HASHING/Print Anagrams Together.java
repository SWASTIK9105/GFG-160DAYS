// Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.
// Examples:
// Input: arr[] = ["act", "god", "cat", "dog", "tac"]
// Output: [["act", "cat", "tac"], ["god", "dog"]]
// Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
// Input: arr[] = ["no", "on", "is"]
// Output: [["is"], ["no", "on"]]
// Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
     public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String,ArrayList<String>> mm = new HashMap<>();
        for(String x:arr)
        {
            char[] temp = x.toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            mm.putIfAbsent(str,new ArrayList<>());
            mm.get(str).add(x);
        }
        for(ArrayList<String> x:mm.values())
        {            ans.add(x);}
        return ans;}}