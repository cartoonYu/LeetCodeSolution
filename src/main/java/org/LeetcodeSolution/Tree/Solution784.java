package org.LeetcodeSolution.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *      784.Letter Case Permutation
 *      https://leetcode.com/problems/letter-case-permutation/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution784 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use a list to get result from recursion
     *     2.2 judge end of recursion and put current string to list
     *     2.3 judge current character digit or letter
     *          2.3.1 if digit,recurse the next character
     *          2.3.2 if upper letter
     *                 2.3.2.1 recurse next character
     *                 2.3.2.2 change current character to lower character
     *                 2.3.2.3 recurse next character
     *          2.3.3 if lower letter,similar with 2.3.2 but change current character to upper character
     * 3.About submit record
     *     3.1 4ms and 37.4MB memory in LeetCode China
     *     3.2 1ms and 37.1MB memory in LeetCode
     * 4.Q&A
     */
    private List<String> res;

    public List<String> letterCasePermutation(String S) {
        res=new LinkedList<>();
        solve(S.toCharArray(),0);
        return res;
    }

    private void solve(char[] data,int index){
        if(index==data.length){
            res.add(new String(data));
            return;
        }
        if(data[index]<'A'){
            solve(data,index+1);
        }
        else{
            if(data[index]>64&&data[index]<91){
                solve(data,index+1);
                data[index]=(char)(data[index]+'a'-'A');
                solve(data,index+1);
            }
            else{
                solve(data,index+1);
                data[index]=(char)(data[index]+'A'-'a');
                solve(data,index+1);
            }
        }
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 it is similar with above solution
     *     2.2 the different is use java function to judge what kind of current character
     * 3.About submit record
     *     3.1 7ms and 39.8MB memory in LeetCode China
     *     3.2 4ms and 37.4MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:How come the time consumption is so different between the two solutions?
     *          A:I think it is about the character judgement,I read function isDigit source and find it has many layers of call,
     *            so I think compare with ascii is more direct and faster than use function,but it may be rely on your memory
     */
    private List<String> resByCallFunc;

    public List<String> letterCasePermutationByCallFunc(String S) {
        resByCallFunc=new LinkedList<>();
        solve(S.toCharArray(),0);
        return resByCallFunc;
    }

    private void solveByCallFunc(char[] data,int index){
        if(index==data.length){
            resByCallFunc.add(new String(data));
            return;
        }
        if(Character.isDigit(data[index])){
            solve(data,index+1);
        }
        else{
            data[index]=Character.toLowerCase(data[index]);
            solve(data,index+1);
            data[index]=Character.toUpperCase(data[index]);
            solve(data,index+1);
        }
    }
}
