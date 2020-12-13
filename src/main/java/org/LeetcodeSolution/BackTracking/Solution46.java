package org.LeetcodeSolution.BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *      46.Permutations
 *      https://leetcode.com/problems/permutations/
 *      https://leetcode-cn.com/problems/permutations/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution46 {

    private List<List<Integer>> list;

    private int[] nums;

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n!)
     *   1.2 空间负责度为 O(n!)
     * 2.我的解题思路
     *   2.1 递归获取所有排列组合
     *   2.2 使用一个递增数字作为结束的条件
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 38.7MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n!)
     *     1.2 Space Complexity is O(n!)
     * 2.how I solve
     *     2.1 use recursion to get full permutation
     *     2.2 use a increase num as a end condition
     * 3.About submit record
     *     3.1 1ms and 38.7MB memory in LeetCode China
     *     3.2 1ms and 39.2MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return list;
        }
        this.nums = nums;
        perm(0, this.nums.length - 1);
        return list;
    }

    private void perm(int k, int m) {
        if (k == m) {
            List<Integer> temp = new ArrayList<>();
            for (int i : nums) {
                temp.add(i);
            }
            list.add(temp);
        } else {
            for (int i = k; i <= m; i++) {
                swap(k, i);
                perm(k + 1, m);
                swap(k, i);
            }
        }
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public Solution46() {
        list = new ArrayList<>();
    }
}
