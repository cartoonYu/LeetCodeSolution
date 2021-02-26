package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     1736.Latest Time by Replacing Hidden Digits
 *     https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
 *     https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1736 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 将传入字符串转换为字符数组
     *       2.1.1 根据第二个数字替换第一个数字
     *       2.1.2 根据第一个数字替换第二个数字
     *       2.1.3 尽可能大的替换第三个数字
     *       2.1.4 根据第三个数字替换第四个数字
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 36.7MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.3MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 turn income string to character array
     *         2.1.1 replace first character according to second character
     *         2.1.2 replace second character according to first character
     *         2.1.3 replace third character as bigger as possible
     *         2.1.4 replace forth character according to third character
     * 3.About submit record
     *     3.1 0ms and 36.7MB memory in LeetCode China
     *     3.2 0ms and 37.3MB memory in LeetCode
     * 4.Q&A
     * @param time
     * @return
     */
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        if(chars[0] == '?'){
            if(chars[1] == '?' || chars[1] < '4'){
                chars[0] = '2';
            } else{
                chars[0] = '1';
            }
        }
        if(chars[1] == '?'){
            if(chars[0] == '2'){
                chars[1] = '3';
            } else{
                chars[1] = '9';
            }
        }
        if(chars[3] == '?'){
            chars[3] = '5';
        }
        if(chars[4] == '?'){
            chars[4] = '9';
        }
        return new String(chars);
    }
}
