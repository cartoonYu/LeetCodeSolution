package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *      455.Assign Cookies
 *      https://leetcode.com/problems/assign-cookies/
 *      https://leetcode-cn.com/problems/assign-cookies/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution455 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 升序排列两个数组
     *     2.2 判断当前cookie是否能满足孩子的需要
     * 3.提交记录
     *     3.1 力扣中耗时20ms,消耗49.2MB内存
     *     3.2 leetcode中耗时8ms,消耗40MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort two array ascending
     *     2.2 Determine if current cookie will meet the child's needs
     *     2.3 end circulation when whichever array traverse end
     * 3.About submit record
     *     3.1 20ms and 49.2MB memory in LeetCode China
     *     3.2 8ms and 40MB memory in LeetCode
     * 4.Q&A
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int l1 = g.length, l2 = s.length;
        while (i < l1 && j < l2) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
