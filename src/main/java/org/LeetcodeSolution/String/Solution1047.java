package org.LeetcodeSolution.String;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *     1047.Remove All Adjacent Duplicates In String
 *     https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1047 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve(this solution isn't prefect enough,I will prefect it im my free time)
     *     2.1 define a stack to get/put character
     *     2.2 circulate string,there have two condition
     *           2.2.1 current character = top character in stack,remove top character
     *           2.2.2 current character != top character in stack,add character to stack
     *     2.3 invert insert character to a result string
     * 3.About submit record
     *     3.1 110ms and 37.4MB memory in LeetCode China
     *     3.2 75ms and 38.9MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        if(S==null||S.length()==0){
            return S;
        }
        Deque<Character> stack=new LinkedList<>();
        for(int i=0,length=S.length();i<length;i++){
            if(stack.size()!=0&&(stack.peekFirst()==S.charAt(i))){
                stack.removeFirst();
            }
            else{
                stack.addFirst(S.charAt(i));
            }
        }
        StringBuilder builder=new StringBuilder();
        while(stack.size()!=0){
            builder.insert(0,stack.removeFirst());
        }
        return builder.toString();
    }
}
