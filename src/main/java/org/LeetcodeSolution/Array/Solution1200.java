package org.LeetcodeSolution.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     1200.Minimum Absolute Difference
 *     https://leetcode.com/problems/minimum-absolute-difference/
 *     https://leetcode-cn.com/problems/minimum-absolute-difference/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1200 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 数组排序
     *   2.2 循环遍历数组，获取数组内最小元素
     *   2.3 循环遍历数组，当当前元素加上最小值等于下一元素，将这两个元素加入到结果中
     * 3. 提交记录
     *   3.1 力扣中耗时 17ms,消耗 50.9MB 内存
     *   3.2 leetcode 中耗时 20ms,消耗 58.1MB 内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(nlogn)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort array
     *     2.2 circulate array to get minimum element
     *     2.3 circulate array, if current element plus minimum element is equals to next element, add this two element to result list
     * 3.About submit record
     *     3.1 17ms and 50.9MB memory in LeetCode China
     *     3.2 20ms and 58.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param arr
     * @return
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(arr);
        int board = arr.length - 1, min = Integer.MAX_VALUE;
        for(int i = 0; i < board; i++){
            if(arr[i + 1] - arr[i] < min){
                min = arr[i + 1] - arr[i];
            }
        }
        for(int i = 0; i < board; i++){
            if(arr[i] + min == arr[i + 1]){
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }
}
