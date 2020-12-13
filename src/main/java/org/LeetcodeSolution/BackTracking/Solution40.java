package org.LeetcodeSolution.BackTracking;

import java.util.*;

/**
 * Problem
 *     40.Combination Sum II
 *     https://leetcode.com/problems/combination-sum-ii/
 *     https://leetcode-cn.com/problems/combination-sum-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     39.Combination Sum
 *     216.Combination Sum III
 * @author cartoon
 * @version 1.0
 */
public class Solution40 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n!)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 这个解法基于回溯算法
     *   2.2 递归中将当前循环的num加入缓存list以及更新当前n，如果n<=0,终止循环，如果n=0，加入当前list到目标list中
     * 3.提交记录
     *   3.1 力扣中耗时6ms,消耗36.9MB内存
     *   3.2 leetcode中耗时4ms,消耗36.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n!)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on backtracking
     *     2.2 sort array first
     *     2.3 recurse to add current num to temp list and update current n util n<=0,when n=0,add temp list to result list
     * 3.About submit record
     *     3.1 6ms and 36.9MB memory in LeetCode China
     *     3.2 4ms and 36.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target == 0) {
            return Collections.emptyList();
        }
        Arrays.sort(candidates);
        res = new LinkedList<>();
        backTracking(candidates, 0, target, new ArrayList<>(), candidates.length);
        return res;
    }

    private List<List<Integer>> res;

    private void backTracking(int[] nums, int cur, int n, List<Integer> list, int length) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            res.add(new ArrayList<>(list));
        }
        for (int i = cur; i < length; i++) {
            list.add(nums[i]);
            n -= nums[i];
            backTracking(nums, i + 1, n, list, length);
            n += nums[i];
            list.remove(list.size() - 1);
            while (i != length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
