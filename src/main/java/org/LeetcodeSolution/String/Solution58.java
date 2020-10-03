package org.LeetcodeSolution.String;

/**
 * Problem
 *      58.Length of Last Word
 *      https://leetcode.com/problems/length-of-last-word/
 *      https://leetcode-cn.com/problems/length-of-last-word/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution58 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 去除字符串头尾空格
     *   2.2 从尾部开始循环字符串，若当前元素为空格，返回计数器
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.7MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.8MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 wipe space which in head and tail from string
     *     2.2 circulate from tail to head, if current element is space, return count
     * 3.About submit record
     *     3.1 0ms and 37.7MB memory in LeetCode China
     *     3.2 0ms and 37.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        s = s.trim();
        int cnt = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                return cnt;
            }
            cnt++;
        }
        return cnt;
    }
}
