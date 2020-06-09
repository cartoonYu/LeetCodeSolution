package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     1189.Maximum Number of Balloons
 *     https://leetcode.com/problems/maximum-number-of-balloons/
 *     https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1189 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义一个长度为26的数组存储字母出现次数
     *   2.2 循环遍历字符串统计字母出现的次数
     *   2.3 从数组获取次数，对比并返回最小的次数
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 39.1MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a array which length is 26 to store count of character
     *     2.2 circulate and statistic count
     *     2.3 get count from array, compare to return minimum count
     * 3.About submit record
     *     3.1 1ms and 39.1MB memory in LeetCode China
     *     3.2 1ms and 39MB memory in LeetCode
     * 4.Q&A
     * @param text
     * @return
     */
    public int maxNumberOfBalloonsByArray(String text) {
        if(text == null || text.length() < 7){
            return 0;
        }
        int[] cnt = new int[26];
        for(char ch : text.toCharArray()){
            cnt[ch - 97] ++;
        }
        cnt['o' - 97] /= 2;
        cnt['l' - 97] /= 2;
        int res = cnt[0];
        char[] chars = new char[]{'b', 'l', 'o', 'n'};
        for(char ch : chars){
            if(res > cnt[ch - 97]){
                res = cnt[ch -97];
            }
        }
        return res;
    }


    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义哈希存储统计次数
     *   2.2 循环统计字母出现的次数
     *   2.3 从哈希获取次数，对比返回最小值
     * 3.提交记录
     *   3.1 力扣中耗时 12ms,消耗 39.8MB 内存
     *   3.2 leetcode 中耗时 6ms,消耗 39.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a map to cache count of character
     *     2.2 circulate and statistic count
     *     2.3 get count from map, compare to return minimum count
     * 3.About submit record
     *     3.1 12ms and 39.8MB memory in LeetCode China
     *     3.2 6ms and 39.4MB memory in LeetCode
     * 4.Q&A
     * @param text
     * @return
     */
    public int maxNumberOfBalloonsByHash(String text) {
        if(text == null || text.length() < 7){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int res = map.getOrDefault('b', 0);
        res = res > map.getOrDefault('a', 0) ? map.getOrDefault('a', 0) : res;
        res = res > map.getOrDefault('l', 0) / 2 ? map.getOrDefault('l', 0) / 2 : res;
        res = res > map.getOrDefault('o', 0) / 2 ? map.getOrDefault('o', 0) / 2 : res;
        res = res > map.getOrDefault('n', 0) ? map.getOrDefault('n', 0) : res;
        return res;
    }
}
