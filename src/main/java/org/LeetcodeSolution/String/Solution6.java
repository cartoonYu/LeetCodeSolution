package org.LeetcodeSolution.String;

/**
 * Problem
 *     6.ZigZag Conversion
 *     https://leetcode.com/problems/zigzag-conversion/
 *     https://leetcode-cn.com/problems/zigzag-conversion/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution6 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 用numRows为长度定义一个StringBuilder数组
     *     2.2 正序遍历字符串中每一个字符
     *         2.2.1 当前索引除于numRows为偶数，表示当前字符最终位置在Z的横线上，用索引为当前索引的余数的StringBuilder拼接字符
     *         2.2.2 当前索引除于numRows为奇数，表示当前字符最终位置在Z的斜线上，倒序StringBuilder数组拼接
     * 3.提交记录
     *     3.1 力扣中耗时7ms,消耗37.1MB内存
     *     3.2 leetcode中耗时5ms,消耗38.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a StringBuilder array by numRows
     *     2.2 circulate to go though all char in string,there have two condition
     *         2.2.1 current index divide with numRows-1 result is even number,it means current char is in vertical sequence,use reminder with numbers index StringBuilder to append it
     *         2.2.2 current index divide with numRows-1 result is odd number,it means current char is in bias,inverted order to append it
     * 3.About submit record
     *     3.1 7ms and 37.1MB memory in LeetCode China
     *     3.2 5ms and 38.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }
        int temp1, temp2;
        for (int i = 0, length = chars.length; i < length; i++) {
            temp1 = i / (numRows - 1);
            temp2 = i % (numRows - 1);
            if (temp1 % 2 == 0) {
                builders[temp2].append(chars[i]);
            } else {
                builders[numRows - temp2 - 1].append(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder temp : builders) {
            res.append(temp);
        }
        return res.toString();
    }
}
