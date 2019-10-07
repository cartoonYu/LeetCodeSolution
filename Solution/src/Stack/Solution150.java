package Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *      150.Evaluate Reverse Polish Notation
 *      https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution150 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a pointer to record current num's index
     *     2.2 circulate from head to tail,there have two condition
     *          2.2.1 current string is a integer,tokens[index]=tokens[current location] and pointer's location plus 1
     *          2.2.2 current string is a operator,take two num according pointer and perform corresponding operation,
     *                  tokens[index]=result and pointer's location plus 1
     *     2.3 return tokens[0]
     * 3.About submit record
     *     3.1 13ms and 37.7MB memory in LeetCode China
     *     3.2 4ms and 36.6MB memory in LeetCode
     * 4.Q&A
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        int index=0;
        for(int i=0,length=tokens.length;i<length;i++){
            if((tokens[i].charAt(0)>='0'&&tokens[i].charAt(0)<='9')||tokens[i].length()>1){
                tokens[index++]=tokens[i];
            }
            else{
                int num=Integer.valueOf(tokens[--index]);
                int temp=Integer.valueOf(tokens[--index]);
                switch(tokens[i]){
                    case "+":{
                        temp+=num;
                        break;
                    }
                    case "-":{
                        temp-=num;
                        break;
                    }
                    case "*":{
                        temp*=num;
                        break;
                    }
                    case "/":{
                        temp/=num;
                        break;
                    }
                }
                tokens[index++]=Integer.toString(temp);
            }
        }
        return Integer.valueOf(tokens[0]);
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use a stack to cache operate result
     *     2.2 circulate from head to tail,there have two condition
     *          2.2.1 current string is a integer,add current element to stack
     *          2.2.2 current string is a operator,take two num from stack and perform corresponding operation,
     *                  add operate result to stack
     *     2.3 return stack's top element
     * 3.About submit record
     *     3.1 20ms and 39.1MB memory in LeetCode China
     *     3.2 5ms and 35.8MB memory in LeetCode
     * 4.Q&A
     * @param tokens
     * @return
     */
    public int evalRPNByStack(String[] tokens) {
        Deque<String> stack=new LinkedList<>();
        for(int i=0,length=tokens.length;i<length;i++){
            if((tokens[i].charAt(0)>='0'&&tokens[i].charAt(0)<='9')||tokens[i].length()>1){
                stack.addFirst(tokens[i]);
            }
            else{
                int num=Integer.valueOf(stack.removeFirst());
                int temp=Integer.valueOf(stack.removeFirst());
                switch(tokens[i]){
                    case "+":{
                        temp+=num;
                        break;
                    }
                    case "-":{
                        temp-=num;
                        break;
                    }
                    case "*":{
                        temp*=num;
                        break;
                    }
                    case "/":{
                        temp/=num;
                        break;
                    }
                }
                stack.addFirst(Integer.toString(temp));
            }
        }
        return Integer.valueOf(stack.removeFirst());
    }
}
