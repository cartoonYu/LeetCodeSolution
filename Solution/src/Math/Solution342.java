package Math;

/**
 * Problem
 *      342. Power of Four
 *      https://leetcode.com/problems/power-of-four/
 *      https://leetcode-cn.com/problems/power-of-four/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      326. Power of Three
 * @author cartoon
 * @version 1.0
 */
public class Solution342 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 排除n<=1的情况
     *     2.2 判断当前n取余4是否等于4
     *     2.3 如果当前n%4!=0，递归n/4继续判断
     * 3.提交记录
     *     3.1 力扣中耗时6ms,消耗33MB内存
     *     3.2 leetcode中耗时1ms,消耗32.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 recurse n to judge result
     *         2.2.1 if n%4!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 6ms and 33MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num==2){
            return false;
        }
        if(num %4!=0){
            return false;
        }
        return isPowerOfFour(num/4);
    }

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2. 我的解题思路
     *     2.1 排除n<=1的情况
     *     2.2 循环操作n判断结果
     *         2.2.1 如果n%4!=0，表明n不可能是4的幂
     *         2.2.2 用n相除4，继续循环判断
     * 3. 提交记录
     *     3.1 力扣中耗时6ms,消耗33.2MB内存
     *     3.2 leetcode中耗时1ms,消耗32.2MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 circulate n to judge result
     *          2.2.1 if n%4!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 6ms and 33.2MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     *      None
     * @param num
     * @return
     */
    public boolean circulation(int num) {
        if(num==1){
            return true;
        }
        if(num<4){
            return false;
        }
        while(num>1){
            if(num%4!=0){
                return false;
            }
            num/=4;
        }
        return true;
    }
}
