package Array;

/**
 * Problem
 *     1413.Minimum Value to Get Positive Step by Step Sum
 *     https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 *     https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1413 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 定义两个临时变量记录计算的情况
     *   2.2 循环遍历1到数组长度的元素，循环相加数组中元素，两个临时变量比较以及交换
     *   2.3 如果最终结果大于0就返回1，否则返回最重结果的最大值加1
     * 3. 提交记录
     *   3.1 力扣中耗时0ms,消耗37.2MB内存
     *   3.2 leetcode中耗时0ms,消耗36.7MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 make two temp variable to record calculate result
     *     2.2 circulate 1 to array's length, add element to temp variable and compare between two temp variable
     *     2.3 if res is bigger than 0 then return 1 otherwise return abs res plus 1
     * 3.About submit record
     *     3.1 0ms and 37.2MB memory in LeetCode China
     *     3.2 0ms and 36.7MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int minStartValue(int[] nums) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        int res = nums[0];
        int temp = res;
        for(int i = 1, length = nums.length; i < length; i++){
            temp += nums[i];
            if(temp < res){
                res = temp;
            }
        }
        return res > 0 ? 1 : Math.abs(res) + 1;
    }

}
