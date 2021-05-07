package org.LeetcodeSolution.String;

/**
 * Problem
 *     551.Student Attendance Record I
 *     https://leetcode.com/problems/student-attendance-record-i/
 *     https://leetcode-cn.com/problems/student-attendance-record-i/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution551 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为题目要是是超过一个late或者连续超过两个L,所以我们只能逐字符遍历字符串
     *     2.2 从头到尾遍历字符串，主要分为三种情况
     *         2.2.1 当前字符为A，自增缓存变量以及用它跟1进行对比
     *         2.2.2 当前字符为L，检查下一字符以及下下一字符是否也为L
     *         2.2.3 当前字符为P，继续遍历
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.3MB内存
     *     3.2 leetcode中耗时0ms,消耗34.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause topic's rule:more than one 'A' (absent) or more than two continuous 'L' (late),so we can only traverse input string's each character
     *     2.2 traverse string from head to tail,there have three condition mainly
     *         2.2.1 current character is A,plus temp integer and compare with 1
     *         2.2.2 current character is L,check next character and next next character whether it is L
     *         2.2.3 current character is P,nothing to do
     * 3.About submit record
     *     3.1 1ms and 34.3MB memory in LeetCode China
     *     3.2 0ms and 34.4MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int cntA = 0;
        for (int i = 0, length = s.length(); i < length; i++) {
            switch (s.charAt(i)) {
                case 'A': {
                    cntA++;
                    if (cntA > 1) {
                        return false;
                    }
                    break;
                }
                case 'L': {
                    if ((i + 2 < length) && (s.charAt(i + 1) == 'L') && (s.charAt(i + 2) == 'L')) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
