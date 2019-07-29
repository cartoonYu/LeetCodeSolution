/**
 * Problem
 *     231.Power of Two
 *     https://leetcode.com/problems/power-of-two/
 *     https://leetcode-cn.com/problems/power-of-two/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution231 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于一些位运算的规律
     *     2.2 如果一个数是2的幂，它的二进制表示一定是第一位是1，后面所有都是0
     *     2.3 如果一个数是2的幂，它的减1的结果二进制表示一定都是1
     *     2.4 所以基于2.2以及2.3，我们可以对n以及n-1使用逻辑与运算
     *         2.4.1 如果运算结果为0，n为2的幂
     *         2.4.2 如果运算结果为1，n不是2的幂
     * 3.提交记录
     *     3.1 力扣中耗时6ms,消耗33.1MB内存
     *     3.2 leetcode中耗时1ms,消耗33.6MB内存
     * 4.Q&A
     *     4.1 Q:有另外的解法吗？
     *         A:我觉得还有一个基于2.2的算法，将源数据转换成二进制表示，然后判断第一位是否为1以及其余各位是否全是0。 我觉得这个算法不算完美，它涉及一个循环以及log n的判断，相对于这个算法更耗费时间。
     *
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
