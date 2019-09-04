/**
 * Problem
 *     279.Perfect Squares
 *     https://leetcode.com/problems/perfect-squares/
 *     https://leetcode-cn.com/problems/perfect-squares/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution279 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n log n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划
     *     2.2 我认为这个题目关键在于两地啊
     *         2.2.1 完全平方数
     *         2.2.2 相加与相减
     *     2.3 我画了一个表推出一个规律：temp[current]=Math.min(min,temp[current-j*j])+1，j*j代表小于n的完全平方数
     *     2.4 使用双重循环遍历
     *         2.4.1 外层循环为1到n，专门设置当前元素的最后结果
     *         2.4.2 内层循环为1到n，但是循环终止条件为j*j<=i,对比获取当前最小value
     * 3.提交记录
     *     3.1 力扣中耗时34ms,消耗36.3MB内存
     *     3.2 leetcode中耗时17ms,消耗35.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 I think this topic is related with two element
     *         2.2.1 perfect squares num
     *         2.2.2 add and subtract
     *     2.3 I draw a form and find a rule:temp[current]=Math.min(min,temp[current-j*j])+1,j*j is expressed as perfect squares num which is smaller than n
     *     2.4 use double circulation to calculate
     *         2.4.1 outer circulation is 1 to n,make final result in current element
     *         2.4.2 inner circulation is also 1 to n,but the end condition is j*j<=i,with calculate squares num,compare and get minimum value
     * 3.About submit record
     *     3.1 34ms and 36.3MB memory in LeetCode China
     *     3.2 17ms and 35.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] temp=new int[n+1];
        int min;
        for(int i=1;i<=n;i++){
            min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(min,temp[i-j*j]);
            }
            temp[i]=min+1;
        }
        return temp[n];
    }

}
