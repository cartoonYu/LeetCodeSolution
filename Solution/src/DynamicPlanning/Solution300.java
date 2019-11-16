package DynamicPlanning;

/**
 * Problem
 *     300.Longest Increasing Subsequence
 *     https://leetcode.com/problems/longest-increasing-subsequence/
 *     https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution300 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n log n)
     * 2.我的解题思路
     *     2.1 定义一个整数保存当前最大长度和一个数组存储当前最长上升序列
     *     2.2 遍历数组
     *         2.2.1 二分查找大于当前元素的最小元素
     *         2.2.2 用当前元素替换掉最小的元素
     *         2.2.3 如果二分查找的左指针等于当前最大长度，表示当前元素都大于最长序列中的元素，当前最大长度加1
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗35.9MB内存
     *     3.2 leetcode中耗时1ms,消耗36MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a integer to cache max sequence length and a array to cache maximum sequence
     *     2.2 circulate array from head to tail
     *         2.1 binary search the minimum element which is bigger than current element
     *         2.2 replace the minimum element with current element
     *         2.3 if binary search left pointer low equals res,it means current element is the biggest element of maximum sequence,res will plus 1
     * 3.About submit record
     *     3.1 2ms and 35.9MB memory in LeetCode China
     *     3.2 1ms and 36MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int lengthOfLISByBinarySearch(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        int res=0;
        for(int i=0,length=nums.length;i<length;i++){
            int low=0,high=res;
            while(low<high){
                int mid=low+((high-low)>>1);
                if(dp[mid]<nums[i]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            dp[low]=nums[i];
            if(low==res){
                res++;
            }
        }
        return res;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n log n)
     * 2.我的解题思路
     *     2.1 定义一个整数保存当前最大长度和一个数组存储当前索引下最大上升序列长度
     *     2.2 遍历数组
     *         2.2.1 初始化辅助数组当前索引的值都为1，代表最坏的情况下当前索引最大上升序列为它本身
     *         2.2.2 遍历数组直到到达外层索引
     *               2.2.2.1 如果nums[i]>nums[j],表示i索引下的最大序列长度为j索引下的加1
     *         2.2.3 对比交换res的值
     * 3.提交记录
     *     3.1 力扣中耗时44ms,消耗35.9MB内存
     *     3.2 leetcode中耗时15ms,消耗36.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to cache maximum length of every index and a integer to cache maximum length of array
     *     2.2 circulate array from 1 to n
     *         2.2.1 make every element of cache array to 1,it means maximum sequence will be itself at least
     *         2.2.2 circulate array from 0 to i
     *               2.2.2.1 if nums[j]<nums[i],it means i index sequence length will be plus 1 at least
     *         2.2.3 compare and swap res with current dp
     * 3.About submit record
     *     3.1 44ms and 35.9MB memory in LeetCode China
     *     3.2 15ms and 36.8MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int res=dp[0];
        for(int i=1,length=nums.length;i<length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res=dp[i]>res?dp[i]:res;
        }
        return res;
    }
}
