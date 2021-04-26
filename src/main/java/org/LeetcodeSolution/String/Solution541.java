package org.LeetcodeSolution.String;

/**
 * Problem
 *     541.Reverse String II
 *     https://leetcode.com/problems/reverse-string-ii/
 *     https://leetcode-cn.com/problems/reverse-string-ii/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution541 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义 StringBuilder 对象存储结果
     *   2.2 根据提议，反转 k - 2k 的字符串
     *   2.3 判断剩余长度，反转或直接拼接
     * 3.提交记录
     *   3.1 力扣中耗时 4ms,消耗 40.1MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 37.9MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a stringBuilder to cache result
     *     2.2 according to topic,reverse before k in 2k
     *     2.3 judge remaining length,choose to reverse or append it directly
     * 3.About submit record
     *     3.1 4ms and 40.1MB memory in LeetCode China
     *     3.2 1ms and 37.9MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int cur = 0;
        while (len >= 2 * k) {
            sb.append(new StringBuilder(s.substring(cur, cur + k)).reverse().append(s, cur + k, cur + 2 * k));
            len -= 2 * k;
            cur += 2 * k;
        }
        if (len < k) {
            sb.append(new StringBuilder(s.substring(cur)).reverse());
        } else if (len < 2 * k) {
            sb.append(new StringBuilder(s.substring(cur, cur + k)).reverse().append(s.substring(cur + k)));
        }
        return sb.toString();
    }
}
