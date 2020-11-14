package org.LeetcodeSolution.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     830.Positions of Large Groups
 *     https://leetcode.com/problems/positions-of-large-groups/
 *     https://leetcode-cn.com/problems/positions-of-large-groups/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution830 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环计算较大分组的位置
     *   2.2 对比当前元素以及后两个元素
     *       2.2.1 如果三个元素相等，记录他们的起始与终止位置
     * 3.提交记录
     *   3.1 力扣中耗时 3ms,消耗 37.8MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 36.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a circulation to cal large group
     *     2.2 compare current char to current position+1 char and current position+2 char
     *          2.2.1 if three char are equals,record start position,use a circulate to get end index
     * 3.About submit record
     *     3.1 3ms and 37.8MB memory in LeetCode China
     *     3.2 1ms and 36.4MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String S) {
        if (S == null || S.length() == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0, length = S.length(); i < length - 2; i++) {
            if (S.charAt(i) == S.charAt(i + 1) && S.charAt(i + 1) == S.charAt(i + 2)) {
                List<Integer> list = new ArrayList();
                list.add(i);
                while (++i < length - 2 && S.charAt(i) == S.charAt(i + 2)) {
                }
                list.add(++i);
                res.add(list);
            }
        }
        return res;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环对比元素
     *   2.2 设置字符串首元素到 lastChar 临时变量
     *   2.3 循环遍历字符串
     *       2.3.1 当前元素等于 lastChar，endIndex++
     *       2.3.2 当前元素不等于 lastChar，计算较大组并且重置 lastChar
     *   2.4 对比 startIndex 以及 endIndex，计算最后一个分段的较大组
     * 3.提交记录
     *   3.1 力扣中耗时 5ms,消耗 39MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 36.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a circulation,two integer and a char to cal large group
     *     2.2 set first char from string to last char
     *     2.3 circulate 1 to string length-1,there have two condition
     *          2.3.1 current char equals lastChar,set endIndex++
     *          2.3.2 current char doesn't equals lastChar,calculate large group and set temp variable with current char
     *     2.4 compare startIndex to endIndex,calculate large group between last sequence char
     * 3.About submit record
     *     3.1 5ms and 39MB memory in LeetCode China
     *     3.2 1ms and 36.2MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions2(String S) {
        if (S == null || S.length() == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        int startIndex = 0, endIndex = 0;
        char lastChar = S.charAt(0);
        for (int i = 1, length = S.length(); i < length; i++) {
            char temp = S.charAt(i);
            if (temp == lastChar) {
                endIndex++;
            } else {
                if ((endIndex - startIndex) > 1) {
                    List<Integer> list = new ArrayList<>();
                    list.add(startIndex);
                    list.add(endIndex);
                    res.add(list);
                }
                lastChar = temp;
                startIndex = i;
                endIndex = i;
            }
        }
        if ((endIndex - startIndex) > 1) {
            List<Integer> list = new ArrayList<>();
            list.add(startIndex);
            list.add(endIndex);
            res.add(list);
        }
        return res;
    }
}
