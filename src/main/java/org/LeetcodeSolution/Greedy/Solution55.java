package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     55.Jump Game
 *     https://leetcode.com/problems/jump-game/
 *     https://leetcode-cn.com/problems/jump-game/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution55 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 定义一个整数存储起点
     *   2.2 倒序遍历数组，有两种情况
     *       2.2.1 当前索引加上索引上的值大于缓存值，这表示在当前索引上有可能到达终点，移动缓存值
     *       2.2.2 当前索引加上索引上的值小于缓存值，表示无法从当前点到达终点，跳出循环
     *   2.3 对比2.1定义的整数是否等于0，如果等于0，表示在索引0上有可能到达终点
     * 3.提交记录
     *   3.1 力扣中耗时2ms,消耗42.2MB内存
     *   3.2 leetcode中耗时1ms,消耗37.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a integer to cache the starting point
     *     2.2 circulate from tail to head,there have two condition
     *          2.2.1 current index plus its val is bigger than temp integer,it means that there have method to reach final point,
     *                  move temp integer to current index
     *          2.2.2 other condition,do not any operation
     *     2.3 compare to temp integer to 0,if temp integer is 0,it means you can go back to start point,
     *              it also means you can reach the destination at the same time
     * 3.About submit record
     *     3.1 2ms and 42.2MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public boolean canJumpByInvertedOrder(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= index) {
                index = i;
            }
        }
        return index == 0;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a integer to cache result
     *     2.2 circulate from head to tail,there have three condition
     *          2.2.1 temp integer<current index,it indicate that no way to the destination,so return false
     *          2.2.2 temp>nums.length-1,it indicate that the destination has been reached,so return true
     *          2.2.3 other condition,compare temp integer to current index plus its val,
     *                  this step is to calculate the farthest can reach
     * 3.About submit record
     *     3.1 4ms and 41.4MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public boolean canJumpByPositiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int temp = 0;
        for (int i = 0, length = nums.length; i < length; i++) {
            if (temp < i) {
                return false;
            } else {
                if (temp >= length - 1) {
                    return true;
                } else {
                    temp = Math.max(temp, i + nums[i]);
                }
            }
        }
        return false;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is depend on element in array
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a multiple recursion to go though all element in array from 1 to its val
     *     2.2 there have two condition mainly
     *          2.2.1 current index>=nums.length-1,it indicate that the destination has been reached,so return true
     *          2.2.2 element in current index is 0,it indicate that no way to the destination,so return false
     *     2.3 when above condition return true,stop the circulation and return
     * 3.About submit record
     *     It haven't pass all test case,only pass 74 in 75.
     * 4.Q&A
     *      4.1 Q:Why does you write this infeasible solution?
     *          A:I think it is work in a certain context,although it didn't pass all test case.
     *            I think this solution provides me another idea to solve this topic,so I write down.
     * @param nums
     * @return
     */
    public boolean canJumpByBackTracking(int[] nums) {
        return cal(nums, 0);
    }

    private boolean cal(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return true;
        }
        if (nums[index] == 0) {
            return false;
        }
        for (int i = 1; i <= nums[index]; i++) {
            if (cal(nums, index + i)) {
                return true;
            }
        }
        return false;
    }
}
