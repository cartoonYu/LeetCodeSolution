package org.LeetcodeSolution.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     387.First Unique Character in a String
 *     https://leetcode.com/problems/first-unique-character-in-a-string/
 *     https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution387 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环遍历a到z，获取当前字母第一次出现以及最后一次出现的索引
     *         2.1.1 如果begin==-1，表示当前字母不存在于源字符串，跳过
     *         2.1.2 如果两次出现的索引不一样，跳过
     *         2.1.3 如果两次出现在同一位置，表示源字符串只含有一个当前字母，更新result
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.9MB内存
     *     3.2 leetcode中耗时1ms,消耗37.9MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate a to z,get current letter first and last appearance
     *         2.1.1 if letter is in source string(begin==-1),skip the letter  operation
     *         2.1.2 two appearance isn't in the same index,skip
     *         2.1.3 two appearance is in the same index,it means source string only have one current letter,update result
     * 3.About submit record
     *     3.1 1ms and 37.9MB memory in LeetCode China
     *     3.2 1ms and 37.9MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        int res = -1, begin, end;
        for (char i = 'a'; i <= 'z'; i++) {
            begin = s.indexOf(i);
            end = s.lastIndexOf(i);
            if (begin == end && begin != -1) {
                if (res == -1) {
                    res = begin;
                } else {
                    res = res > begin ? begin : res;
                }
            }
        }
        return res;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 第一次循环获取源字符串的字母出现次数
     *     2.2 第二次遍历找出第一次出现的唯一字符
     * 3.提交记录
     *     3.1 力扣中耗时55ms,消耗37.6MB内存
     *     3.2 leetcode中耗时33ms,消耗38.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 first round is to static appearance time and store in a hashMap
     *     2.2 second round is to find the letter which is only appearance once
     * 3.About submit record
     *     3.1 55ms and 37.6MB memory in LeetCode China
     *     3.2 33ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public int firstUniqCharByHashMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char temp : chars) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (int i = 0, length = chars.length; i < length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
