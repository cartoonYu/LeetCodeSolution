/**
 * Problem
 *     322.Coin Change
 *     https://leetcode.com/problems/coin-change/
 *     https://leetcode-cn.com/problems/coin-change/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution322 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n*m)(n为硬币数组的长度，m为总金额+1)
     *     1.2 空间负责度为O(m)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划
     *     2.2 定义一个数组存储计算的结果
     *     2.3 二重循环
     *         2.3.1 外层循环遍历硬币数组
     *         2.3.2 内层循环从1开始遍历amount
     *                2.3.2.1 当前amount等于当前硬币，数组的当前元素设为1
     *                2.3.2.2 temp[j-coins]!= and temp[j]==0，表示当前数组元素没有被设置，设置为temp[j-coin]
     *                2.3.2.3 temp[j-coins]!= and temp[j]!=0，对比temp[j]与temp[j-coin]的大小
     * 3.提交记录
     *     3.1 力扣中耗时22ms,消耗37.9MB内存
     *     3.2 leetcode中耗时8ms,消耗36MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n*m)(n is coins.length,m is amount+1)
     *     1.2 Space Complexity is O(m)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 define a array cache calculate result
     *     2.3 use a double circulation
     *         2.3.1 outer circulation is coins circulation
     *         2.3.2 inner circulation is amount circulation
     *                 2.3.2.1 if current amount is equals current coin,set 2.2 array's current amount is 1
     *                 2.3.2.2 temp[j-coins]!= and temp[j]==0,means current element haven't set,set with temp[j-coin]
     *                 2.3.2.3 temp[j-coins]!= and temp[j]!=0,compare with temp[j] and temp[j-coin]
     * 3.About submit record
     *     3.1 22ms and 37.9MB memory in LeetCode China
     *     3.2 8ms and 36MB memory in LeetCode
     * 4.Q&A
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if(amount==0||coins==null||coins.length==0){
            return 0;
        }
        int[] temp=new int[amount+1];
        int size=amount+1;
        for(int coin:coins){
            for(int j=coin;j<size;j++){
                if(coin==j){
                    temp[j]=1;
                }
                else if(temp[j-coin]!=0){
                    if(temp[j]==0){
                        temp[j]=temp[j-coin]+1;
                    }
                    else{
                        temp[j]=Math.min(temp[j],temp[j-coin]+1);
                    }
                }
            }
        }
        return temp[amount]==0?-1:temp[amount];
    }

}
