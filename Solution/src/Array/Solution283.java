package Array;

/**
 * Problem
 *     283.Move Zeroes
 *     https://leetcode.com/problems/move-zeroes/submissions/
 *     https://leetcode-cn.com/problems/move-zeroes/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution283 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义两个循环实现功能
     *     2.2 第一个循环将非0元素移到首部并记录边界
     *     2.3 第二个循环将边界外的元素设为0
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗41.6MB内存
     *     3.2 leetcode中耗时0ms,消耗39.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two circulate to achieve it
     *     2.2 first circulate is to move none 0 to head and record border of none 0
     *     2.3 second circulate is to set 0 within border
     * 3.About submit record
     *     3.1 1ms and 41.6MB memory in LeetCode China
     *     3.2 0ms and 39.2MB memory in LeetCode
     * 4.Q&A
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if(nums.length==0){
            return ;
        }
        int flag=-1;
        for(int i=0,length=nums.length;i<length;i++){
            if(nums[i]!=0){
                nums[++flag]=nums[i];
            }
        }
        for(int j=nums.length-1;j>flag;j--){
            nums[j]=0;
        }
    }
}
