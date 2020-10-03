package org.LeetcodeSolution.String;

/**
 * Problem
 *     796.Rotate String
 *     https://leetcode.com/problems/rotate-string/
 *     https://leetcode-cn.com/problems/rotate-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution796 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 利用StringBuilder拼接A两次
     *     2.2 利用StringBuilder成员方法indexOf对比判断B是否在拼接的字符串上(拼接两次的字符串含有所有的旋转字符串可能性)
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.8MB内存
     *     3.2 leetcode中耗时0ms,消耗33.9MB内存
     * 4.Q&A
     *     4.1 Q:这个解法与解法2有区别吗？
     *         A:差别在于拼接A的方法上，String的拼接需要经过常量池的追加，拼接对象的返回，StringBuilder只需在堆上直接操作
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use a stringBuilder to append string A twice
     *     2.2 use function indexOf to judge whether B is in builder(append twice string will be contains all rotation possibility)
     * 3.About submit record
     *     3.1 1ms and 35.2MB memory in LeetCode China
     *     3.2 0ms and 34MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Is there have any difference between this solution and solution 2？
     *         A:The difference is in append string,use stringBuilder to append is faster than append it directly,
     *              if you don't like to use another variable,you can use function concat in string to append string.
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString3(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        StringBuilder builder=new StringBuilder(A);
        builder.append(A);
        return builder.indexOf(B)!=-1;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 拼接A自身
     *     2.2 利用String成员方法contains对比判断B是否在拼接的字符串上(拼接两次的字符串含有所有的旋转字符串可能性)
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.8MB内存
     *     3.2 leetcode中耗时0ms,消耗33.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 append A with itself
     *     2.2 use function contains to judge whether B is in builder(append twice string will be contains all rotation possibility)
     * 3.About submit record
     *     3.1 1ms and 34.8MB memory in LeetCode China
     *     3.2 0ms and 33.9MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString2(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        A=A+A;
        return A.contains(B);
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 拼接除第一个字符之外的所有字符串，然后再在末尾拼接第一个字符
     *     2.2 对比拼接后的字符串与对比字符串
     *     2.3 这个解法虽然简答，但是用了太多时间。虽然是可行的，但是我不喜欢这个算法
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗35.9MB内存
     *     3.2 leetcode中耗时1ms,消耗35.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 append except first character and after  append first character
     *     2.2 compare with append string and another string
     *     2.3 this solution's mind is simple,but it use a lot time.It's work,but I don't like it
     * 3.About submit record
     *     3.1 2ms and 35.9MB memory in LeetCode China
     *     3.2 1ms and 35.4MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString1(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0,length=A.length();i<length;i++){
            builder.append(A.substring(1)).append(A.charAt(0));
            A=builder.toString();
            if(A.equals(B)){
                return true;
            }
            builder.delete(0,builder.length());
        }
        return false;
    }
}
