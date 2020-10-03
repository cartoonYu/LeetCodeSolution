package org.LeetcodeSolution.Math;

/**
 * Problem
 *     191.Number of 1 Bits
 *     https://leetcode.com/problems/number-of-1-bits/
 *     https://leetcode-cn.com/problems/number-of-1-bits/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution191 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(log n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 利用n与n-1的位与运算去除最后一个1，result自增
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.5MB内存
     *   3.2 leetcode中耗时1ms,消耗33.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 wipe out last 1 by and bit operation between n and n-1,result will be increased
     * 3.About submit record
     *     3.1 1ms and 33.5MB memory in LeetCode China
     *     3.2 1ms and 33.6MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int hammingWeightByBitOperate(int n) {
        if(n==0){
            return 0;
        }
        int res=0;
        while(n!=0){
            n&=(n-1);
            res++;
        }
        return res;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 转换源数字成为二进制字符串
     *   2.2 遍历字符串，统计1的个数
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.3MB内存
     *   3.2 leetcode中耗时1ms,消耗33.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 change source number to binary string
     *     2.2 circulate string and count the number of ones
     * 3.About submit record
     *     3.1 1ms and 33.3MB memory in LeetCode China
     *     3.2 1ms and 33.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int hammingWeightByConvert(int n) {
        String temp=Integer.toBinaryString(n);
        int res=0;
        for(char ch:temp.toCharArray()){
            if(ch=='1'){
                res++;
            }
        }
        return res;
    }
}
