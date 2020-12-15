package org.LeetcodeSolution.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     90.Subsets II
 *     https://leetcode.com/problems/subsets-ii/
 *     https://leetcode-cn.com/problems/subsets-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     78.Subsets
 * @author cartoon
 * @version 1.0
 */
public class Solution90 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为2*O(n-1)-1
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于回溯法实现
     *     2.2 定义一个操作list以及结果list
     *     2.3 将数组排序以便在回溯中去除重复子集
     *     2.4 递归回溯
     *         2.4.1 将操作list加入结果list
     *         2.4.2 从传入的当前位置遍历数组
     *                  2.4.2.1 将当前遍历的元素加入操作list中
     *                  2.4.2.2 递归遍历下一元素
     *                  2.4.2.3 移除2.4.2.1加入的元素
     *                  2.4.2.4 判断去除重复的元素
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗38.4MB内存
     *     3.2 leetcode中耗时1ms,消耗37.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is 2*O(n-1)-1
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on backTracking
     *     2.2 define a operate list and result list
     *     2.3 sort array to wipe off repetition in recurse
     *     2.4 add current operate list to result list
     *     2.5 circulate current position to nums.length
     *         2.5.1 add current element to operate list
     *         2.5.2 recurse and traverse next element
     *         2.5.3 remove 2.5.1 add element
     *         2.5.4 judge and wipe off repetition in next circulate element
     * 3.About submit record
     *     3.1 3ms and 38.4MB memory in LeetCode China
     *     3.2 1ms and 37.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        res = new ArrayList<>();
        Arrays.sort(nums);
        backTracking(nums, 0, new ArrayList<>());
        return res;
    }

    private List<List<Integer>> res;

    private void backTracking(int[] nums, int index, List<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int i = index, length = nums.length; i < length; i++) {
            list.add(nums[i]);
            backTracking(nums, i + 1, list);
            list.remove(list.size() - 1);
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
