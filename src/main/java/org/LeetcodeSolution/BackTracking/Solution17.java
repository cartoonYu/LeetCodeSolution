package org.LeetcodeSolution.BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     17.Letter Combinations of a Phone Number
 *     https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *     https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution17 {

    private List<String> list;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个算法基于回溯算法
     *     2.2 计算当前元素与当前键的值
     *     2.3 循环遍历当前键元素以及递归遍历源字符串
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗36.2MB内存
     *     3.2 leetcode中耗时0ms,消耗36MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on backTrack
     *     2.2 calculate current character value and what character it has
     *     2.3 circulate what character it has and backTracking source string
     * 3.About submit record
     *     3.1 1ms and 36.2MB memory in LeetCode China
     *     3.2 0ms and 36MB memory in LeetCode
     * 4.Q&A
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }
        list = new ArrayList<>();
        backTracking(digits, 0, new StringBuilder());
        return list;
    }

    private void backTracking(String digits, int index, StringBuilder builder) {
        if (index == digits.length()) {
            list.add(builder.toString());
            return;
        }
        int temp = Character.digit(digits.charAt(index), 10);
        int border = temp == 7 || temp == 9 ? 4 : 3;
        char[] c = new char[border];
        int startElement = 0;
        if (temp == 8) {
            startElement = 116;
        } else {
            if (temp == 9) {
                startElement = 119;
            } else {
                startElement = (temp - 2) * 3 + 97;
            }
        }
        for (int i = 0; i < border; i++) {
            c[i] = (char) startElement;
            startElement++;
        }
        for (int i = 0; i < border; i++) {
            builder.append(c[i]);
            backTracking(digits, index + 1, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
