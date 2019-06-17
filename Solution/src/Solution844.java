import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *      844.Backspace String Compare
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution844 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two stringBuilder to cache character from S and T
     *     2.2 using for loop to circulate S and T apart,which obey following rules
     *          2.2.1 current character is in a to z,append it to string
     *          2.2.2 current character is #,judge string size and delete the last element from string
     *     2.4 compare two string by using function equals
     * 3.About submit record
     *     3.1 3ms and 34.6MB memory in LeetCode China
     *     3.2 1ms and 34.4MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareByString2(String S, String T) {
        String s=formStringByString2(S);
        String t=formStringByString2(T);
        return s.equals(t);
    }

    private String formStringByString2(String source){
        StringBuilder builder=new StringBuilder();
        for(int i=0,length=source.length();i<length;i++){
            char temp=source.charAt(i);
            if(temp>='a'&&temp<='z'){
                builder.append(temp);
                continue;
            }
            if(temp=='#'&&builder.length()!=0){
                builder.deleteCharAt(builder.length()-1);
            }
        }
        return builder.toString();
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two stringBuilder to cache character from S and T
     *     2.2 using foreach to circulate S and T apart,which obey following rules
     *          2.2.1 current character is in a to z,append it to string
     *          2.2.2 current character is #,judge string size and delete the last element from string
     *     2.4 compare two string by using function equals
     * 3.About submit record
     *     3.1 3ms and 34.6MB memory in LeetCode China
     *     3.2 1ms and 34.4MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareByString1(String S, String T) {
        String s=formStringByString1(S);
        String t=formStringByString1(T);
        return s.equals(t);
    }

    private String formStringByString1(String source){
        StringBuilder builder=new StringBuilder();
        for(char temp:source.toCharArray()){
            if(temp>='a'&&temp<='z'){
                builder.append(temp);
                continue;
            }
            if(temp=='#'&&builder.length()!=0){
                builder.deleteCharAt(builder.length()-1);
            }
        }
        return builder.toString();
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two stack to cache character from S and T
     *     2.2 circulate S and T apart,which obey following rules
     *          2.2.1 current character is in a to z,add to stack
     *          2.2.2 current character is #,judge stack size,and remove the top element from stack
     *     2.3 form string whose elements are from stack
     *     2.4 compare two string by using function equals
     * 3.About submit record
     *     3.1 3ms and 34.4MB memory in LeetCode China
     *     3.2 1ms and 35.8MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareByStackString(String S, String T) {
        String s=formStringByStackString(S);
        String t=formStringByStackString(T);
        return s.equals(t);
    }

    private String formStringByStackString(String source){
        Deque<Character> stack=new LinkedList<>();
        for(char temp:source.toCharArray()){
            if(temp>='a'&&temp<='z'){
                stack.addFirst(temp);
                continue;
            }
            if(temp=='#'&&stack.size()!=0){
                stack.removeFirst();
            }
        }
        StringBuilder builder=new StringBuilder();
        while(stack.size()!=0){
            builder.append(stack.removeFirst());
        }
        return builder.toString();
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two stack to cache character from S and T
     *     2.2 circulate S and T apart,which obey following rules
     *          2.2.1 current character is in a to z,add to stack
     *          2.2.2 current character is #,judge stack size,and remove the top element from stack
     *     2.3 compare two stack's element
     * 3.About submit record
     *     3.1 4ms and 34.5MB memory in LeetCode China
     *     3.2 1ms and 34.4MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareByStack(String S, String T) {
        Deque<Character> stack1=new LinkedList<>(),stack2=new LinkedList<>();
        for(char temp:S.toCharArray()){
            if(temp>='a'&&temp<='z'){
                stack1.addFirst(temp);
                continue;
            }
            if(temp=='#'&&stack1.size()!=0){
                stack1.removeFirst();
                continue;
            }
        }
        for(char temp:T.toCharArray()){
            if(temp>='a'&&temp<='z'){
                stack2.addFirst(temp);
                continue;
            }
            if(temp=='#'&&stack2.size()!=0){
                stack2.removeFirst();
            }
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(stack1.size()!=0){
            if(stack1.removeFirst()!=stack2.removeFirst()){
                return false;
            }
        }
        return true;
    }
}
