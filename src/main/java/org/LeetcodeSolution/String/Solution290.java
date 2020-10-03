package org.LeetcodeSolution.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     290.Word Pattern
 *     https://leetcode.com/problems/word-pattern/
 *     https://leetcode-cn.com/problems/word-pattern/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution290 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 将传入的pattern和str切割转换成数组
     *     2.2 如果2.1中的两个数组长度不相等，直接返回false
     *     2.3 定义一个HashMap存储映射关系
     *     2.4 同时遍历两个数组，有三种情况
     *         2.4.1 map含有当前pattern但是value不相等，返回false
     *         2.4.2 map含有当前value但是没有pattern，返回false
     *         2.4.3 map都没有当前pattern以及value，将他们放入HashMap
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗34.3MB内存
     *     3.2 leetcode中耗时1ms,消耗34.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 change pattern and str to char array and string array
     *     2.2 if 2.1 two array have different length,return false directly
     *     2.3 define a hashMap cache mapping relation
     *     2.4 circulate to go though two array at the same time,there have three condition
     *         2.4.1 map have current pattern but value is not equals,return false
     *         2.4.2 map have current value but haven't key,return false
     *         2.4.3 map haven't current key and value,put them to map and keep circulate
     * 3.About submit record
     *     3.1 3ms and 34.3MB memory in LeetCode China
     *     3.2 1ms and 34.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||str==null){
            return false;
        }
        char[] chars=pattern.toCharArray();
        String[] strs=str.split(" ");
        if(chars.length!=strs.length){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        int i=0,length=strs.length;
        while(i<length){
            if(map.containsKey(chars[i])){
                if(!map.get(chars[i]).equals(strs[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(strs[i])){
                    return false;
                }
                map.put(chars[i],strs[i]);
            }
            i++;
        }
        return true;
    }
}
