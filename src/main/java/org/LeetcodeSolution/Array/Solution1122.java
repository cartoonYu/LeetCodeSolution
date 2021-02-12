package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1122.Relative Sort Array
 *     https://leetcode.com/problems/relative-sort-array/
 *     https://leetcode-cn.com/problems/relative-sort-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1122 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义一个长度为 1001 的数组统计数组 1 元素出现的次数
     *   2.2 循环遍历数组 1，统计数组 1 元素出现的次数并放入 2.1 定义的数组中
     *   2.3 循环遍历数组 2，根据 2.1 定义数组拿出数组 1 元素并放入数组 1 中
     *   2.4 循环遍历 2.1 定义的数组，将剩余元素放入数组 1 中
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 38.6MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 39.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a array which length is 1001 to statistic arr1 number appearance count
     *     2.2 circulate arr1, statistic arr1 number appearance count and mark result to 2.1 array
     *     2.3 circulate arr2, take arr1 number count according 2.1 array and put to arr1
     *     2.4 circulate 2.1 array, put remain number to arr1
     * 3.About submit record
     *     3.1 0ms and 38.6MB memory in LeetCode China
     *     3.2 0ms and 39.4MB memory in LeetCode
     * 4.Q&A
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnts = new int[1001];
        for(int num : arr1){
            cnts[num]++;
        }
        int resIndex = 0;
        for(int num : arr2){
            for(int index = 0; index < cnts[num]; index++){
                arr1[resIndex++] = num;
            }
            cnts[num] = 0;
        }
        for(int index = 0; index < 1001; index++){
            for(int innerIndex = 0, length = cnts[index]; innerIndex < length; innerIndex++){
                arr1[resIndex++] = index;
            }
        }
        return arr1;
    }
}
