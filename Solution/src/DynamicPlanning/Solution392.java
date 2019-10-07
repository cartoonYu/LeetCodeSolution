package DynamicPlanning;

/**
 * Problem
 *     392.Is Subsequence
 *     https://leetcode.com/problems/is-subsequence/
 *     https://leetcode-cn.com/problems/is-subsequence/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution392 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 基于前一相等字符的索引对比得出当前元素
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗50.3MB内存
     *     3.2 leetcode中耗时0ms,消耗49.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 compare current element with last element index
     * 3.About submit record
     *     3.1 1ms and 50.3MB memory in LeetCode China
     *     3.2 0ms and 49.3MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] chars=s.toCharArray();
        int index=-1;
        for(char temp:chars){
            index=t.indexOf(temp,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
    }
}
