package org.LeetcodeSolution.Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Problem
 *     347.Top K Frequent Elements
 *     https://leetcode.com/problems/top-k-frequent-elements/
 *     https://leetcode-cn.com/problems/top-k-frequent-elements/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution347 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 遍历数组统计每个元素出现的次数
     *   2.2 根据元素出现的次数，将元素塞进以出现次数为索引的列表数组中
     *   2.3 倒序遍历列表数组，将列表数组中元素取出并放入返回数组中
     * 3.提交记录
     *   3.1 力扣中耗时 12ms,消耗 40.7MB 内存
     *   3.2 leetcode 中耗时 7ms,消耗 41.6MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate array and statistics its appearance count
     *     2.2 depend on appearance count, put number to list array which index is depend on appearance count
     *     2.3 circulate list array by reverse order, put list's element to result array and return
     * 3.About submit record
     *     3.1 12ms and 40.7MB memory in LeetCode China
     *     3.2 7ms and 41.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int cnt;
        for(int num : nums){
            cnt = map.getOrDefault(num, 0);
            map.put(num, cnt + 1);
        }
        List<Integer>[] cnts = new List[length + 1];
        for(int i = 0; i <= length; i++){
            cnts[i] = new LinkedList<>();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            cnts[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = length; i >= 0; i--){
            if(!cnts[i].isEmpty()){
                for(Integer num : cnts[i]){
                    res[index++] = num;
                    k--;
                    if(k == 0){
                        break;
                    }
                }
            }
            if(k == 0){
                break;
            }
        }
        return res;
    }
}
