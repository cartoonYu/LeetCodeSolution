package org.LeetcodeSolution.Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     599.Minimum Index Sum of Two Lists
 *     https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 *     https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution599 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 利用 list1 元素以及索引构建 Hash
     *   2.2 循环遍历 list2，有四种情况
     *       2.2.1 hash 中已经存在当前元素，hash 中的 value 与当前索引相加结果小于 flag，清空 list 更新 flag 以及 list
     *       2.2.2 hash 中已经存在当前元素，hash 中的 value 与当前索引相加结果等于 flag，当前元素加入 list
     *       2.2.3 hash 中已经存在当前元素，hash 中的 value 与当前索引相加结果大于 flag，跳过
     *       2.2.4 hash 中不含有当前元素，跳过
     * 3.提交记录
     *   3.1 力扣中耗时11ms,消耗38.4MB内存
     *   3.2 leetcode中耗时8ms,消耗38.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use list1 and its index form a hash
     *     2.2 circulate list2,there have four condition
     *         2.2.1 hash has current element,value from hash and current index operation result is smaller than flag,clear current list and swap flag and list
     *         2.2.2 hash has current element,value from hash and current index operation result is equals to flag,add current element to list
     *         2.2.3 hash has current element,value from hash and current index operation result is bigger than flag,skip
     *         2.2.4 hash hasn't current element,skip
     *     2.3 return array which is base on list
     * 3.About submit record
     *     3.1 11ms and 38.4MB memory in LeetCode China
     *     3.2 8ms and 38.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0, length = list1.length; i < length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new LinkedList<>();
        int flag = Integer.MAX_VALUE;
        for (int i = 0, length = list2.length; i < length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if (sum < flag) {
                    list.clear();
                    flag = sum;
                    list.add(list2[i]);
                } else if (sum == flag) {
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

}
