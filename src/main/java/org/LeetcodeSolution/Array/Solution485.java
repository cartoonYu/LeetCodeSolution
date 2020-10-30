package org.LeetcodeSolution.Array;

/**
 * Problem
 *      485.Max Consecutive Ones
 *      https://leetcode.com/problems/max-consecutive-ones/
 *      https://leetcode-cn.com/problems/max-consecutive-ones/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution485 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 利用两个缓存变量存储1的个数
     *   2.2 遍历数组
     *       2.2.1 如果当前元素为0，对比result以及temp的值，将temp置0
     *       2.2.2 如果当前元素为1，temp自增
     *   2.3 返回temp以及result的较大值
     * 3.提交记录
     *   3.1 力扣中耗时8ms,消耗52.5MB内存
     *   3.2 leetcode中耗时3ms,消耗39.6MB内存
     * 4.Q&A
     *   4.1 Q:为什么第一个解法比第二个解法快这么多？
     *       A:我觉得是判断条件的问题，因为1为数组中主要的元素，所以用1作为判断条件会减少判断的次数
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two integer to cache number of 1
     *     2.2 circulate array
     *          2.2.1 if current element is 1,temp++
     *          2.2.2 if current element is 0,compare result to temp and set temp 0
     *     2.3 return the largest of temp and result
     * 3.About submit record
     *     3.1 5ms and 50.7MB memory in LeetCode China
     *     3.2 2ms and 38.2MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:Why this solution is faster than the another solution with similar structure?
     *          A:I think is about judging condition,cause 1 is main element,so make it to if condition can reduce judge time.
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        int temp = 0;
        for (int i : nums) {
            if (i == 1) {
                temp++;
            } else {
                result = result < temp ? temp : result;
                temp = 0;
            }
        }
        return result < temp ? temp : result;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 利用两个缓存变量存储1的个数
     *   2.2 遍历数组
     *       2.2.1 如果当前元素为0，对比result以及temp的值，将temp置0
     *       2.2.2 如果当前元素为1，temp自增
     *   2.3 返回temp以及result的较大值
     * 3.提交记录
     *   3.1 力扣中耗时8ms,消耗52.5MB内存
     *   3.2 leetcode中耗时3ms,消耗39.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two integer to cache number of 1
     *     2.2 circulate array
     *          2.2.1 if current element is 0,compare result to temp and set temp 0
     *          2.2.2 if current element is 1,temp++
     *     2.3 return the largest of temp and result
     * 3.About submit record
     *     3.1 8ms and 52.5MB memory in LeetCode China
     *     3.2 3ms and 39.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int anotherFindMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        int temp = 0;
        for (int i : nums) {
            if (i == 0) {
                result = temp > result ? temp : result;
                temp = 0;
                continue;
            }
            temp++;
        }
        result = temp > result ? temp : result;
        return result;
    }
}
