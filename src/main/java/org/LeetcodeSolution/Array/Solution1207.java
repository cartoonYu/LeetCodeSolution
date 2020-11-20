package org.LeetcodeSolution.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Problem
 *     problem's topic and description
 *     https://leetcode.com/problems/unique-number-of-occurrences/
 *     https://leetcode-cn.com/problems/unique-number-of-occurrences/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1207 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 循环遍历数组统计元素出现次数到 hash 中
     *   2.2 使用 hash 筛选唯一元素
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 37.3MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 37.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate array and put count and element to hash
     *     2.2 use a hash to screen out unique number
     * 3.About submit record
     *     3.1 2ms and 37.3MB memory in LeetCode China
     *     3.2 1ms and 37.2MB memory in LeetCode
     * 4.Q&A
     * @param arr
     * @return
     */
    public boolean uniqueOccurrencesByHash(int[] arr) {
        if(arr == null || arr.length == 0){
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int cnt : map.values()){
            if(!set.add(cnt)){
                return false;
            }
        }
        return true;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 因为题目划定了元素大小范围，所以也适用于计数排序
     *   2.2 定义正数与负数的计数数组
     *   2.3 使用 hash 筛选唯一元素
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 37.2MB 内存
     *   3.2 leetcode 中耗时 2ms,消耗 38.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 cause topic had make the scope of array's element, so this topic will fit with counting sort
     *     2.2 make two array with negative and positive element
     *     2.3 circulate array and put count to 2.2 array
     *     2.4 use hash to screen out unique number
     * 3.About submit record
     *     3.1 1ms and 37.2MB memory in LeetCode China
     *     3.2 2ms and 38.4MB memory in LeetCode
     * 4.Q&A
     * @param arr
     * @return
     */
    public boolean uniqueOccurrencesByCountInSort(int[] arr) {
        if(arr == null || arr.length == 0){
            return true;
        }
        int[] positiveNum = new int[1001];
        int[] negativeNum = new int[1000];
        for(int num : arr){
            if(num >= 0){
                positiveNum[num] += 1;
            } else{
                negativeNum[Math.abs(num) - 1] += 1;
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int num : positiveNum){
            if(num != 0 && set.contains(num)){
                return false;
            }
            set.add(num);
        }
        for(int num : negativeNum){
            if(num != 0 && !set.add(num)){
                return false;
            }
        }
        return true;
    }
}
