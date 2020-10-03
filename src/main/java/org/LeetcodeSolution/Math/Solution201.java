package org.LeetcodeSolution.Math;

/**
 * Problem
 *      201.Bitwise AND of Numbers Range
 *      https://leetcode.com/problems/bitwise-and-of-numbers-range/
 *      https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution201 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于leetcode中国评论区的评论
     *     2.2 用一个整型变量存储偏移量
     *     2.3 同时右移m与n直到他们相等
     *     2.4 返回n左移2.2整型的结果
     * 3.提交记录
     *     3.1 力扣中耗时36ms,消耗37.6MB内存
     *     3.2 leetcode中耗时5ms,消耗35.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on a comment from leetCode china
     *     2.2 use a integer to cache offset
     *     2.3 right deviate n and m util m=n
     *     2.4 return n left offset cache integer
     * 3.About submit record
     *     3.1 36ms and 37.6MB memory in LeetCode China
     *     3.2 5ms and 35.7MB memory in LeetCode
     * 4.Q&A
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAnd(int m, int n) {
        if(m==n){
            return m;
        }
        if(m==0){
            return 0;
        }
        int off=0;
        for(;m!=n;off++){
            m>>=1;
            n>>=1;
        }
        return n<<off;
    }
}
