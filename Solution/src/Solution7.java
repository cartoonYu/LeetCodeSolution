/**
 * Problem
 *      7. Reverse Integer
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */

public class Solution7 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate when x!=0
     *     2.2 get remainder of x
     *     2.3 add reminder to result integer,and each pass the result integer is tenfold than last pass
     *     2.4 return result integer
     * 3.About submit record
     *     3.1 13ms and 38MB memory in LeetCode China
     *     3.2 13ms and 38MB memory in LeetCode
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
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
