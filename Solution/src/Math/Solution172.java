package Math;

/**
 * Problem
 *     172.Factorial Trailing Zeroes
 *     https://leetcode.com/problems/factorial-trailing-zeroes/
 *     https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution172 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O()
     *   1.2 空间负责度为O()
     * 2.我的解题思路
     *   2.1 因为0只可能是2跟5相乘得到的结果，而2出现的次数会比5多得多，所以我们只需要统计5因子出现的次数就可以得到0的次数
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗33.6MB内存
     *   3.2 leetcode中耗时1ms,消耗33.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause zero only could be the result of two multipart five,and the num of two will more than five
     *     2.2 according to 2.1,we only need to static the num of five
     * 3.About submit record
     *     3.1 1ms and 33.6MB memory in LeetCode China
     *     3.2 1ms and 33.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        if(n<5){
            return 0;
        }
        int res=0;
        while(n>=5){
            res+=n/5;
            n/=5;
        }
        return res;
    }
}
