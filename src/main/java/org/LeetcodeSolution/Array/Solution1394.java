package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1394.Find Lucky Integer in an Array
 *     https://leetcode.com/problems/find-lucky-integer-in-an-array/
 *     https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1394 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 因为每个元素在一定范围内，所以可以采用计数排序解题
     *   2.2 循环遍历数组，统计每个元素出现的次数
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 39.7MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 cause each element have range,so this topic is suit with counting sort
     *     2.2 statistic element and its appearance counting
     * 3.About submit record
     *     3.1 1ms and 39.7MB memory in LeetCode China
     *     3.2 1ms and 39.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param arr
     * @return
     */
    public int findLucky(int[] arr) {
        int[] cnts = new int[501];
        for(int num : arr){
            cnts[num]++;
        }
        for(int i = 500; i > 0; i--){
            if(cnts[i] == i){
                return i;
            }
        }
        return -1;
    }

}
