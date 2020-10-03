package org.LeetcodeSolution.Array;

/**
 * Problem
 *     problem's topic and description
 *     https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 *     https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1460 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 因为两个数组所有元素的大小都属于固定的范围，所以我们可以使用计数排序思想解题
     *   2.2 定义一个长度为 1001 的数组
     *   2.3 循环两个数组，target 数组循环相加计数，arr 数组循环相减计数
     *   2.4 如果计数数组含有非 0 元素，表示两个数组含有不同的元素，返回 false，否则返回 true
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 39.7MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 cause all element from two array both have range, so we can use counting sort
     *     2.2 define a array which length is 1001
     *     2.3 circulate two array, plus count in target circulation, subtract count in arr circulation
     *     2.4 if 2.2 array have non zero element, it means two array have different element, return false, otherwise return true
     * 3.About submit record
     *     3.1 2ms and 39.7MB memory in LeetCode China
     *     3.2 1ms and 39.5MB memory in LeetCode
     * 4.Q&A
     * @param target
     * @param arr
     * @return
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] cnts = new int[1001];
        for(int num : target){
            ++cnts[num];
        }
        for(int num : arr){
            --cnts[num];
        }
        for(int cnt : cnts){
            if(cnt != 0){
                return false;
            }
        }
        return true;
    }
}
