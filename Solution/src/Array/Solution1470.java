package Array;

/**
 * Problem
 *     1470.Shuffle the Array
 *     https://leetcode.com/problems/shuffle-the-array/
 *     https://leetcode-cn.com/problems/shuffle-the-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1470 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义起始位置为 0 以及 n 的双指针
     *   2.2 循环遍历数组，将当前指针的元素放入新数组，返回
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 40.1MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 40.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define two pointer which position are 0 and n
     *     2.2 circulate source array, put current two element to a new array and return
     * 3.About submit record
     *     3.1 0ms and 40.1MB memory in LeetCode China
     *     3.2 0ms and 40.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        if(nums == null || nums.length < 2){
            return nums;
        }
        int cur1 = 0, cur2 = n;
        int[] res = new int[nums.length];
        for(int i = 0, length = res.length; i < length; i+=2){
            res[i] = nums[cur1];
            res[i + 1] = nums[cur2];
            cur1++;
            cur2++;
        }
        return res;
    }

}
