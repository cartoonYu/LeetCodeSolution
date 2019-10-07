package DynamicPlanning;

/**
 * Problem
 *     338.Counting Bits
 *     https://leetcode.com/problems/counting-bits/
 *     https://leetcode-cn.com/problems/counting-bits/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution338 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划
     *     2.2 画表得到一个规律：res[current]=res[current&(current-1)]+1
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗42.6MB内存
     *     3.2 leetcode中耗时1ms,消耗38.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 I draw a form,discover a rule:current count is current num take a and operation with its last num count plus 1
     * 3.About submit record
     *     3.1 3ms and 42.6MB memory in LeetCode China
     *     3.2 1ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        res[0]=0;
        for(int i=1;i<=num;i++){
            res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}
