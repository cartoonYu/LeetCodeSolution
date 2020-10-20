package org.LeetcodeSolution.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Problem
 *      380. Insert Delete GetRandom O(1)
 *      https://leetcode.com/problems/insert-delete-getrandom-o1/
 *      https://leetcode-cn.com/problems/insert-delete-getrandom-o1/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      None
 * @author cartoon
 * @version 1.0
 */
public class Solution380 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 使用两个 HashMap（一个为 index-value，一个为 value-index）以及一个整数计数器count
     *   2.2 插入功能就是传统的插入到两个 HashMap 中
     *   2.3 删除功能
     *       2.3.1 获取传入数所在索引
     *       2.3.2 用数组中最后一个值覆盖2.3.1上索引上的值
     *       2.3.3 移除最后一个元素以及更新计数器
     * 3.提交记录
     *   3.1 力扣中耗时12ms,消耗44.3MB内存
     *   3.2 leetcode中耗时12ms,消耗44.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two hashMap(one for index-value,one for value-index) and a count to finish function
     *     2.2 function insert is traditional put into hashMap and increase count
     *     2.3 function delete
     *         2.3.1 get incoming number's index
     *         2.3.2 cover 2.3.1's index by last element in array
     *         2.3.3 remove last element and decrease count
     *     2.4 function getRandom will get a random index and return value
     * 3.About submit record
     *     3.1 12ms and 44.3MB memory in LeetCode China
     *     3.2 12ms and 44.3MB memory in LeetCode
     * 4.Q&A
     */

    private Map<Integer, Integer> map1;

    private Map<Integer, Integer> map2;

    private int count;

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insertByHashMap(int val) {
        if (map2.containsKey(val)) {
            return false;
        } else {
            map1.put(count, val);
            map2.put(val, count);
            count++;
            return true;
        }
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean removeByHashMap(int val) {
        if (map2.containsKey(val)) {
            count--;
            int index = map2.get(val);
            int value = map1.get(count);
            map1.put(index, value);
            map2.put(value, index);
            map1.remove(count);
            map2.remove(val);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get a random element from the set.
     */
    public int getRandomByHashMap() {
        if (count == 0) {
            return 0;
        }
        int index = (int) (Math.random() * count);
        return map1.get(index);
    }

    /**
     * NOTICE: 这个解法可行，但是没完全符合题目的要求
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度依赖与set中的数据多少
     * 2.我的解题思路
     *   2.1 因为题目严格要求平均时间复杂度为 O(1)，所以我选择HashSet作为我的底层数据结构
     *   2.2 插入与删除操作依赖于HashSet的成员方法
     *   2.3 random 方法依赖于HashSet的大小，我使用一个随机数生成转换数组的索引并返回
     * 3.提交记录
     *   3.1 力扣中耗时545ms,消耗85MB内存
     *   3.2 leetcode中耗时177ms,消耗58.2MB内存
     * 4.Q&A
     *
     * NOTICE:this is a work solution,but it's not fit to topic asking
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is depend on number of set elements
     * 2.how I solve
     *     2.1 cause problem restrict average time complexity is O(1),so I choice HashSet to be my data structure
     *     2.2 The operations of insert,remove are base on HashSet's member function
     *     2.3 The operation of random is base on hashSet's size,I use a random number to choice which number to be returned
     * 3.About submit record
     *     3.1 545ms and 85MB memory in LeetCode China
     *     3.2 177ms and 58.2MB memory in LeetCode
     * 4.Q&A
     */

    private Set<Integer> set;

    /**
     * Initialize your data structure here.
     */
    public Solution380() {
        set = new HashSet<>();
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        count = 0;
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        } else {
            set.add(val);
            return true;
        }
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        if (set.size() == 0) {
            return 0;
        }
        Integer[] data = set.toArray(new Integer[set.size()]);
        int index = (int) (Math.random() * set.size());
        return data[index];
    }
}
