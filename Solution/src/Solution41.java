/**
 * Problem
 *    41.First Missing Positive
 *    https://leetcode.com/problems/first-missing-positive/submissions/
 *    https://leetcode-cn.com/problems/first-missing-positive/submissions/
 * Grade of difficulty
 *    Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution41 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于桶排序思想
     *     2.2 循环将nums[i]放入到索引为nums[i-1]上
     *     2.3 循环检查索引是否等于当前索引的值减1
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.7MB内存
     *     3.2 leetcode中耗时0ms,消耗34.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution reference bucket sort's mind
     *     2.2 circulate to put nums[i] to index nums[i]-1
     *     2.3 circulate to check nums[i]-1!=i
     * 3.About submit record
     *     3.1 1ms and 34.7MB memory in LeetCode China
     *     3.2 0ms and 34.7MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0){
            return 1;
        }
        int length=nums.length;
        for(int i=0;i<length;i++){
            while(nums[i]>0&&nums[i]<=length&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<length;i++){
            if(nums[i]-1!=i){
                return i+1;
            }
        }
        return length+1;
    }
}
