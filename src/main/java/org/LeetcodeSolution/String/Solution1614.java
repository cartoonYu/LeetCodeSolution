package org.LeetcodeSolution.String;

/**
 * Problem
 *     1614. Maximum Nesting Depth of the Parentheses
 *     https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 *     https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1614 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 切割字符串为字符数组
     *   2.2 循环遍历数组，统计括号数量，左括号加 1，右括号减 1，暂存最大值
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 36.6MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 split string to character array
     *     2.2 circulate array, statistic bracket, left bracket plus 1, right bracket subtract 1, mark biggest count
     * 3.About submit record
     *     3.1 1ms and 36.6MB memory in LeetCode China
     *     3.2 0ms and 37.2MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public int maxDepth(String s) {
        int cnt = 0, max = 0;
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(ch == '('){
                cnt += 1;
            } else if(ch == ')'){
                cnt -= 1;
            }
            if(cnt > max){
                max = cnt;
            }
        }
        return max;
    }
}
