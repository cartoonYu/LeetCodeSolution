/**
 * Problem
 *     303.Range Sum Query - Immutable
 *     https://leetcode.com/problems/range-sum-query-immutable/
 *     https://leetcode-cn.com/problems/range-sum-query-immutable/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution303 {

    private int[] nums;

    private int[] sum;

    public Solution303(int[] nums) {
        this.nums=nums;
        initSum();
    }

    private void initSum(){
        if(nums.length==0){
            return;
        }
        sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1,length=nums.length;i<length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划
     *     2.2 在调用sumRange前通过sum[i]=sum[i-1]+nums[i]直接计算所有可能的结果
     * 3.提交记录
     *     3.1 力扣中耗时110ms,消耗44.3MB内存
     *     3.2 leetcode中耗时50ms,消耗42.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.1 calculate within the scope of element ahead,the rule is sum[i]=sum[i-1]+nums[i]
     *     2.2 return sum range directly when call the function
     * 3.About submit record
     *     3.1 110ms and 44.3MB memory in LeetCode China
     *     3.2 50ms and 42.1MB memory in LeetCode
     * 4.Q&A
     * @param i
     * @param j
     * @return
     */
    public int sumRange(int i, int j) {
        if(i>=j){
            return nums[i];
        }
        if(i==0){
            return sum[j];
        }
        return sum[j]-sum[i-1];
    }
}
