package org.LeetcodeSolution.Math;

/**
 * Problem
 *     693.Binary Number with Alternating Bits
 *     https://leetcode.com/problems/binary-number-with-alternating-bits/
 *     https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution693 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 位与操作获取源数的最后一位
     *   2.2 循环直到源数为0
     *       2.2.1 右移源数一位
     *       2.2.2 获取当前源数的最后一位
     *       2.2.3 对比并更新2.1中的比特位
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.1MB内存
     *   3.2 leetcode中耗时0ms,消耗33.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use and operation to get last bit
     *     2.2 circulate util n equals 0
     *         2.2.1 divide n with 2
     *         2.2.2 get current bit by and operation
     *         2.2.3 compare and update 2.1 bit
     * 3.About submit record
     *     3.1 1ms and 33.1MB memory in LeetCode China
     *     3.2 0ms and 33.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits2(int n) {
        int flag=n&1,temp;
        while(n!=0){
            n=n>>1;
            temp=n&1;
            if(flag==temp){
                return false;
            }
            else{
                flag=temp;
            }
        }
        return true;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 将传入的数转换成二进制字符串
     *   2.2 标记第一个字符
     *   2.3 循环第二个到最后一个字符，对比交换2.2的字符，如果当前字符等于2.2中的字符，返回false
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.3MB内存
     *   3.2 leetcode中耗时1ms,消耗34.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 change source number to binary string
     *     2.2 mark first character
     *     2.3 circulate second element to last element,compare and swap 2.2 character,if current character is equals to 2.2 character,return false
     * 3.About submit record
     *     3.1 1ms and 33.3MB memory in LeetCode China
     *     3.2 1ms and 34.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits1(int n) {
        String str=Integer.toBinaryString(n);
        char flag=str.charAt(0);
        for(int i=1,length=str.length();i<length;i++){
            if(flag==str.charAt(i)){
                return false;
            }
            else{
                flag=flag=='0'?'1':'0';
            }
        }
        return true;
    }
}
