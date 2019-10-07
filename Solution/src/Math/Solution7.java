package Math;

/**
 * Problem
 *      7.Reverse Integer
 *      https://leetcode.com/problems/reverse-integer/
 *      https://leetcode-cn.com/problems/reverse-integer/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */

public class Solution7 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环直到x为0
     *     2.2 暂存x剩下的值
     *     2.3 每次循环结果为上次循环的10倍，将2.2暂存值加到返回的结果上
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗33.8MB内存
     *     3.2 leetcode中耗时1ms,消耗33.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate when x!=0
     *     2.2 get remainder of x
     *     2.3 add reminder to result integer,and each pass the result integer is tenfold than last pass
     *     2.4 return result integer
     * 3.About submit record
     *     3.1 1ms and 33.8MB memory in LeetCode China
     *     3.2 1ms and 33.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
