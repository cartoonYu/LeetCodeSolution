/**
 * Problem
 *     231.Power of Two
 *     https://leetcode.com/problems/power-of-two/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution231 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on some binary rule
     *     2.2 if one num is pow of two,its binary form is the top bit is 1 and other bit is 0
     *     2.3 if one num is pow of two,n-1 binary form is all 1
     *     2.4 so we can use above two rule to design our solution,use a and operation between n and n-1,if result is 0,n is pow of two
     * 3.About submit record
     *     3.1 6ms and 33.1MB memory in LeetCode China
     *     3.2 1ms and 33.6MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:have another solution?
     *         A:I think I still have a solution,it base on rule 1(2.2),first translate n to binary form,then go though every bit to judge
     *              whether it fit rule 1.But I think this solution is not perfect,it refer to one circulate and log n judgement,it spend more
     *              time than this solution.
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return n>0&&((n&(n-1))==0);
    }

}
