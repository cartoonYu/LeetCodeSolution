package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     442.Find All Duplicates in an Array
 *     https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *     https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution442 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 因为题目要求不要申请额外的空间，而数组所有元素都大于 0 ，所以我们可以利用数组索引标记重复元素
     *   2.2 循环遍历数组，获取以当前元素为索引的元素，若此元素小于0，此元素为重复元素，若大于 0，将此元素置为负数
     * 3.提交记录
     *   3.1 力扣中耗时 8ms,消耗 48MB 内存
     *   3.2 leetcode 中耗时 8ms,消耗 63.8MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause topic ask us not to apply extra space, element from array are all bigger than 0, so we can use array index to mark repetitive element
     *     2.2 circulate array, use current element to index, judge element in index is negative, when negative, add to result list, otherwise turn the element to negative
     * 3.About submit record
     *     3.1 8ms and 48MB memory in LeetCode China
     *     3.2 8ms and 63.8MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for(int num : nums){
            if(nums[Math.abs(num) - 1] > 0){
                nums[Math.abs(num) - 1] *= -1;
            } else{
                res.add(Math.abs(num));
            }
        }
        return res;
    }

}
