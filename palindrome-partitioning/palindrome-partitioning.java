class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList();
        helper(s, new ArrayList<String>(), result);
        return result;
    }
    
    public void helper(String s, List<String> step, List<List<String>> result) {
        if(s == null || s.length() == 0) {
            result.add(new ArrayList<>(step));
            return;
        }
        
        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue;
            step.add(temp);
            helper(s.substring(i, s.length()), step, result);
            step.remove(step.size()-1);
            
        }
        return;
    }
    
    private boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

/*

All backtracking problems are composed by these three steps: choose, explore, unchoose.
So for each problem, you need to know:

choose what? For this problem, we choose each substring.
how to explore? For this problem, we do the same thing to the remained string.
unchoose Do the opposite operation of choose.
Let's take this problem as an example:
1.Define helper(): Usually we need a helper funcition in backtracking problem, to accept more parameters.
2.Parameters: Usually we need the following parameters

    1. The object you are working on:  For this problem is String s.
    2. A start index or an end index which indicate which part you are working on: For this problem, we use substring to indicate the start index.
    3. A step result, to remember current choose and then do unchoose : For this problem, we use List<String> step.
    4. A final result, to remember the final result. Usually when we add, we use 'result.add(new ArrayList<>(step))' instead of 'result.add(step)', since step is reference passed. We will modify step later, so we need to copy it and add the copy to the result;
3.Base case: The base case defines when to add step into result, and when to return.
4.Use for-loop: Usually we need a for loop to iterate though the input String s, so that we can choose all the options.
5.Choose: In this problem, if the substring of s is palindrome, we add it into the step, which means we choose this substring.
6.Explore: In this problem, we want to do the same thing to the remaining substring. So we recursively call our function.
7.Un-Choose: We draw back, remove the chosen substring, in order to try other options.

*/