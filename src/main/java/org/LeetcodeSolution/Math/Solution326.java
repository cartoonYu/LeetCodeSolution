package org.LeetcodeSolution.Math;

/**
 * Problem
 *      326. Power of Three
 *      https://leetcode.com/problems/power-of-three/
 *      https://leetcode-cn.com/problems/power-of-three/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      342. Power of Four
 * @author cartoon
 * @version 1.0
 */
public class Solution326 {

    /**
     * 用取余跟除法计算结果
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 手动排除n<=1的情况
     *     2.2 循环n判断结果
     *         2.2.1 如果n%3!=0，就明显表明了没有可能返回true，所以返回false
     *         2.2.2 n自身除3
     * 3.提交记录
     *     3.1 力扣中耗时87ms,消耗40.4MB内存
     *     3.2 leetcode中耗时10ms,消耗35.8MB内存
     * 4.Q&A
     *
     *  use mod and divide number in circulation to solve
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 circulate n to judge result
     *          2.2.1 if n%3!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 87ms and 40.4MB memory in LeetCode China
     *     3.2 10ms and 35.8MB memory in LeetCode
     * 4.Q&A
     *      None
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return true;
    }

    /**
     * use mod and divide number in recursion to solve
     * 1.About Complexity
     *    1.1 Time Complexity is O(n)
     *    1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 exclude n<=1 manually
     *      2.2 recurse n to judge result
     *          2.2.1 if n%3!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 85ms and 39.5MB memory in LeetCode China
     *     3.2 no record in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public boolean recursion(int n) {
        if(n==1){
            return true;
        }
        if(n<3){
            return false;
        }
        if(n%3!=0){
            return false;
        }
        return recursion(n/3);
    }


}
