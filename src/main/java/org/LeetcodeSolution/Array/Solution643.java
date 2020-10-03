package org.LeetcodeSolution.Array;

/**
 * Problem
 *     643.Maximum Average Subarray I
 *     https://leetcode.com/problems/maximum-average-subarray-i/submissions/
 *     https://leetcode-cn.com/problems/maximum-average-subarray-i/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution643 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 将前k个元素加到结果 res 中
     *   2.2 将 res 的值赋给临时变量 temp
     *   2.3 对临时变量 temp 进行加当前元素以及减去 i-k 索引下的元素，对比 temp 以及 sum 的大小并交换
     * 3.提交记录
     *   3.1 力扣中耗时4ms,消耗40.9MB内存
     *   3.2 leetcode中耗时3ms,消耗41.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 add first k element to sum
     *     2.2 set temp with sum's value
     *     2.3 add temp with remaining element and subtract i-k element,compare temp with sum and change
     * 3.About submit record
     *     3.1 4ms and 40.9MB memory in LeetCode China
     *     3.2 3ms and 41.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        if(nums==null||nums.length<k){
            return 0;
        }
        int res=0;
        for(int i=0;i<k;i++){
            res+=nums[i];
        }
        int temp=res;
        for(int i=k,length=nums.length;i<length;i++){
            temp+=nums[i]-nums[i-k];
            res=Math.max(temp,res);
        }
        return res*1.0/k;
    }
}
